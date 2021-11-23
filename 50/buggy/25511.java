public boolean saveItem(com.psk.pms.dao.Item item) {
    jdbcTemplate.update(com.psk.pms.dao.SAVEITEMS, item.getItemName(), item.getItemUnit(), item.getItemType());
    return true;
}