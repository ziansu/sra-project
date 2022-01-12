public static void main(java.lang.String[] args) throws java.beans.PropertyVetoException, java.io.IOException, java.sql.SQLException {
    edu.umass.cs.mysqlBenchmarking.MySQLBenchmarking2.dsInst = new edu.umass.cs.mysqlBenchmarking.DataSource();
    edu.umass.cs.mysqlBenchmarking.MySQLBenchmarking2.benchmarkAttrUpdateTime();
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    edu.umass.cs.mysqlBenchmarking.MySQLBenchmarking2.benchmarkPrivacyInsertTimeSingleInsert();
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    edu.umass.cs.mysqlBenchmarking.MySQLBenchmarking2.benchmarkPrivacyInsertTimeMultipleInsert();
}