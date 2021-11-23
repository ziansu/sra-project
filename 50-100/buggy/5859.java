@org.testng.annotations.Test
public void testDayAlign() {
    java.lang.String sqlQuery = java.lang.String.format("SELECT DATE_FORMAT(time,'%s'), COUNT(*) FROM '%s' %nGROUP BY PERIOD(1 DAY)", com.axibase.tsd.api.method.sql.function.period.align.SqlPeriodDayAlignTest.DAY_FORMAT_PATTERN, com.axibase.tsd.api.method.sql.function.period.align.SqlPeriodDayAlignTest.TEST_METRIC_NAME);
    javax.ws.rs.core.Response response = executeQuery(sqlQuery);
    com.axibase.tsd.api.model.sql.StringTable resultTable = response.readEntity(com.axibase.tsd.api.model.sql.StringTable.class);
    java.util.List<java.util.List<java.lang.String>> expectedRows = generateExpectedRows(java.util.Arrays.asList("2016-06-19T00:00:00.000Z", "2016-06-20T00:00:00.000Z", "2016-06-21T00:00:00.000Z", "2016-06-22T00:00:00.000Z"));
    assertTableRows(expectedRows, resultTable);
}