@ua.com.juja.sqlcmd.Model.Test
public void testDropTable() {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.LinkedHashMap<>();
    map.put("name", "text");
    ua.com.juja.sqlcmd.Model.PostgreSqlManagerTest.manager.createTable(map, "testDropTable");
    ua.com.juja.sqlcmd.Model.PostgreSqlManagerTest.manager.dropTable("testDropTable");
    java.util.Set<java.lang.String> set = ua.com.juja.sqlcmd.Model.PostgreSqlManagerTest.manager.getTableNames();
    junit.framework.TestCase.assertFalse(set.contains("testDropTable"));
}