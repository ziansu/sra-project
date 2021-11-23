public void testLog() {
    java.lang.System.setProperty("lumens.base", "../dist/lumens");
    com.lumens.backend.ApplicationContext.createInstance(test.ServiceTest.class.getClassLoader());
    com.lumens.backend.ApplicationContext.get().start();
    com.lumens.backend.service.LogService ls = new com.lumens.backend.service.LogService();
    javax.ws.rs.core.Response resp = ls.listLogItem(false, 0, 0);
    java.lang.String str = resp.getEntity().toString();
    java.lang.System.out.println(("logs:" + str));
}