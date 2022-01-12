@org.jboss.arquillian.container.test.api.Deployment
public static org.jboss.shrinkwrap.api.Archive<?> createDeployment() {
    org.jboss.shrinkwrap.api.Archive<?> archive = org.jboss.shrinkwrap.api.ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.JavaArchive.class, "foo.jar").addClasses(com.actionbazaar.buslogic.OrderProcessor.class, com.actionbazaar.buslogic.OrderProcessorBean.class, com.actionbazaar.buslogic.ItemService.class, com.actionbazaar.buslogic.ItemServiceBean.class, com.actionbazaar.persistence.Bid.class, com.actionbazaar.persistence.Bidder.class, com.actionbazaar.persistence.Item.class, com.actionbazaar.buslogic.ItemServiceTest.class).addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml").addAsManifestResource("test-persistence.xml", org.jboss.shrinkwrap.api.ArchivePaths.create("persistence.xml"));
    java.lang.System.out.println(archive.toString(true));
    return archive;
}