@org.junit.BeforeClass
public static void setup() throws java.sql.SQLException {
    iudex.da.Helper._dataSource = iudex.da.DataSourceFactory.create();
    org.apache.commons.dbutils.QueryRunner runner = new org.apache.commons.dbutils.QueryRunner(iudex.da.Helper._dataSource);
    runner.update("DELETE from urls;");
}