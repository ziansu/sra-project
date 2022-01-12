@org.junit.Test
public void testInsert() {
    try {
        org.jplus.model.Servers servers = new org.jplus.model.Servers();
        servers.setId(100);
        servers.setName("server");
        servers.setNote("server");
        servers.setType(100);
        servers.setAdds("adds");
        org.jplus.hyb.database.crud.Hyberbin hyberbin = new org.jplus.hyb.database.crud.Hyberbin(servers);
        hyberbin.insert("");
    } catch (java.sql.SQLException ex) {
        org.junit.Assert.fail("testInsert faild.");
    }
}