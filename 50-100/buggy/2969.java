public void creatHistory(java.lang.Integer userId, java.lang.String seatId) {
    java.lang.System.out.println("11111");
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
    com.domain.Historyinfo historyinfo = new com.domain.Historyinfo();
    historyinfo.setUserId(userId);
    historyinfo.setSeatId(seatId);
    historyinfo.setDate(sdf.format(new java.util.Date()));
    java.lang.System.out.println(historyinfo);
    int isInsert = historyinfoService.creatHistoryinfo(historyinfo);
}