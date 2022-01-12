public java.util.List<com.epam.asw.sty.model.Item> findItemsForUserbyChannelByCountSortedbyTitle(java.lang.String user, int count, java.lang.String orderItemField) {
    java.util.List<com.epam.asw.sty.model.Item> items = itemDao.findForUserbyChannelByCountSortedbyTitle(user, count, orderItemField);
    return items;
}