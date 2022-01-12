public void deleteTicketTypes(java.util.List<java.lang.Integer> ticketTypeids) throws com.subang.tool.SuException {
    boolean isAll = true;
    for (java.lang.Integer ticketTypeid : ticketTypeids) {
        try {
            ticketTypeDao.delete(ticketTypeid);
            com.subang.util.SuUtil.deleteFile(ticketTypeDao.get(ticketTypeid).getIcon());
        } catch (org.springframework.dao.DataIntegrityViolationException e) {
            isAll = false;
        }
    }
    if (!isAll) {
        throw new com.subang.tool.SuException("部分优惠券类型没有成功删除。可能是用户的优惠券引用了这些类型。");
    }
}