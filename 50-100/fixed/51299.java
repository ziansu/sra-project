@org.jplus.hyb.database.crud.Test
public void testShowOnebyKey() {
    java.lang.System.out.println("showOnebyKey");
    org.jplus.model.Servers servers = org.jplus.hyb.database.crud.HyberbinTest.getByID(1);
    assertNotNull(servers);
    assertNotNull(servers.getAdds());
    assertNotNull(servers.getName());
    assertNotNull(servers.getId());
    assertNotNull(servers.getType());
    assertNotNull(servers.getNote());
}