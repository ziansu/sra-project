@org.jboss.arquillian.container.test.api.Deployment
public static org.jboss.shrinkwrap.api.spec.JavaArchive createDeployment() {
    return org.jboss.shrinkwrap.api.ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.JavaArchive.class).addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
}