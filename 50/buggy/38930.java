private java.util.List<org.xcolab.model.tables.pojos.User_> listAllMembersSortByScreenName(int startRecord, int limitRecord, java.lang.String filter, boolean isAscOrder) {
    return listAllMembersSortByField(startRecord, limitRecord, filter, USER_.SCREEN_NAME, isAscOrder);
}