@org.junit.Test
public void testSetTableName() {
    java.lang.System.out.println("setTableName");
    java.lang.String tableName = "error";
    org.jplus.model.Servers servers = new org.jplus.model.Servers();
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin(servers);
    instance.setTableName(tableName);
    servers.setId(0);
    try {
        instance.showOnebyKey("id");
    } catch (java.sql.SQLException ex) {
        org.junit.Assert.assertTrue((ex instanceof java.sql.SQLException));
        return ;
    }
    org.junit.Assert.fail("testSetTableName faild.");
}