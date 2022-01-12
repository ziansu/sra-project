@org.junit.Test
public void getSql() throws java.lang.Exception {
    java.lang.String root = java.lang.Thread.currentThread().getContextClassLoader().getResource("").getPath();
    java.lang.String path = root + "cdctables.properties";
    java.lang.String tableName = "CentralEndData.cdc.dbo_PriceTrend_CT";
    Properties.Process.TableStructureService tableStructureService = new Properties.Process.TableStructureServiceImpl(path, tableName);
    java.lang.System.out.println(tableStructureService.getSql());
}