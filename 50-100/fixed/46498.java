@org.jboss.arquillian.container.test.api.Deployment
public static org.jboss.shrinkwrap.api.spec.WebArchive createDeployment() {
    return org.jboss.shrinkwrap.api.ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.WebArchive.class).addPackages(true, "net.weweave.tubewarder").addAsResource("META-INF/persistence.xml").addAsWebInfResource("resources.xml").addAsWebInfResource("openejb-jar.xml").addAsLibrary(new java.io.File("../outputhandlers/sysout/target/outputhandler-sysout.jar"), "outputhandler-sysout.jar");
}