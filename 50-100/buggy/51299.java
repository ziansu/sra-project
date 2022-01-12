@org.junit.Test
public void testShowOnebyKey() {
    java.lang.System.out.println("showOnebyKey");
    org.jplus.model.Servers servers = org.jplus.hyb.database.crud.HyberbinTest.getByID(1);
    org.junit.Assert.assertNotNull(servers);
    org.junit.Assert.assertNotNull(servers.getAdds());
    org.junit.Assert.assertNotNull(servers.getName());
    org.junit.Assert.assertNotNull(servers.getId());
    org.junit.Assert.assertNotNull(servers.getType());
    org.junit.Assert.assertNotNull(servers.getNote());
}