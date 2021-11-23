public void addVerboseMessage(java.lang.String message) {
    verboseMessages.add(new biz.netcentric.cq.tools.actool.installationhistory.HistoryEntry(msgIndex, new java.sql.Timestamp(new java.util.Date().getTime()), (" " + message)));
    (msgIndex)++;
}