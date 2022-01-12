private com.ygl.piggynote.controller.StatData queryAndStatUserData(java.lang.String userName) {
    com.ygl.piggynote.controller.StatData sd = new com.ygl.piggynote.controller.StatData();
    queryAndStatMonthsData(userName, sd);
    queryAndStatCurMonthData(userName, sd);
    queryAndStatPrepayData(userName, sd);
    return sd;
}