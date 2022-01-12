@org.jplus.hyb.database.crud.Test
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
        assertTrue((ex instanceof java.sql.SQLException));
        return ;
    }
    fail("testSetTableName faild.");
}