public static void main(java.lang.String[] args) {
    final org.jboss.weld.environment.se.Weld weld = new org.jboss.weld.environment.se.Weld();
    final org.jboss.weld.environment.se.WeldContainer cdiContainer = weld.initialize();
    final app.DemoApplication app = cdiContainer.select(app.DemoApplication.class).get();
    app.run();
    weld.shutdown();
}