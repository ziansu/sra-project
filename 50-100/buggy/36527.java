@org.junit.Test
public void testUpdateByKey() {
    java.lang.System.out.println("updateByKey");
    org.jplus.model.Servers servers = org.jplus.hyb.database.crud.HyberbinTest.getByID(1);
    java.lang.String name = "testUpdateByKey";
    servers.setName(name);
    org.jplus.hyb.database.crud.Hyberbin instance = new org.jplus.hyb.database.crud.Hyberbin(servers);
    try {
        instance.updateByKey("id");
    } catch (java.sql.SQLException ex) {
        org.junit.Assert.fail("testUpdateByKey faild.");
        ex.printStackTrace();
    }
    servers = org.jplus.hyb.database.crud.HyberbinTest.getByID(1);
    org.junit.Assert.assertEquals(servers.getName(), name);
}