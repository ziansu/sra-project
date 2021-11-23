public static void main(java.lang.String[] args) {
    final org.jboss.weld.environment.se.Weld weld = new org.jboss.weld.environment.se.Weld().enableDiscovery().addPackage(false, dao.HibernateUtil.class).addPackage(false, app.DemoApplication.class);
    final org.jboss.weld.environment.se.WeldContainer cdiContainer = weld.initialize();
    final app.DemoApplication app = cdiContainer.instance().select(app.DemoApplication.class).get();
    app.run();
    weld.shutdown();
}