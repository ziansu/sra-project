@org.testng.annotations.Test
public void testDayAlign() {
    java.lang.String sqlQuery = java.lang.String.format("SELECT DATE_FORMAT(time,'%s'), COUNT(*) FROM '%s' %nGROUP BY PERIOD(1 DAY)", com.axibase.tsd.api.method.sql.function.period.align.SqlPeriodDayAlignTest.DAY_FORMAT_PATTERN, com.axibase.tsd.api.method.sql.function.period.align.SqlPeriodDayAlignTest.TEST_METRIC_NAME);
    javax.ws.rs.core.Response response = executeQuery(sqlQuery);
    com.axibase.tsd.api.model.sql.StringTable resultTable = response.readEntity(com.axibase.tsd.api.model.sql.StringTable.class);
    java.util.List<java.util.List<java.lang.String>> expectedRows = generateExpectedRows();
    assertTableRows(expectedRows, resultTable);
}