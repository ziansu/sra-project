public void insertReportingPeriod(org.activityinfo.store.mysql.cursor.QueryExecutor executor) {
    if ((date1) == null) {
        date1 = new java.util.Date(0);
    }
    if ((date2) == null) {
        date2 = new java.util.Date(0);
    }
    reportingPeriodId = new org.activityinfo.model.legacy.KeyGenerator().generateInt();
    executor.update(("INSERT INTO reportingperiod (siteId, reportingPeriodId, date1, date2, dateCreated, dateEdited) " + "VALUES (?, ?, ?, ?, ?, ?)"), java.util.Arrays.asList(siteId, reportingPeriodId, date1, date2, new java.util.Date(), new java.util.Date()));
}