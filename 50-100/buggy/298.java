@java.lang.Override
protected org.jboss.shrinkwrap.api.Archive<?> buildArchive() {
    org.jboss.shrinkwrap.api.spec.JavaArchive archive = org.jboss.shrinkwrap.api.ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.JavaArchive.class, "arquillian-junit.jar").addPackages(true, "junit", "org.junit", "org.hamcrest", org.jboss.arquillian.junit.Arquillian.class.getPackage().getName()).addAsServiceProvider(org.jboss.arquillian.container.test.spi.TestRunner.class, org.jboss.arquillian.junit.container.JUnitTestRunner.class);
    return archive;
}