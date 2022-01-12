@org.jboss.arquillian.container.test.api.Deployment
public static org.jboss.shrinkwrap.api.Archive<?> createDeployment() {
    return org.jboss.shrinkwrap.api.ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.JavaArchive.class, "foo.jar").addClasses(com.actionbazaar.buslogic.OrderProcessor.class, com.actionbazaar.buslogic.OrderProcessorBean.class, com.actionbazaar.buslogic.ItemService.class, com.actionbazaar.buslogic.ItemServiceBean.class, com.actionbazaar.persistence.Bid.class, com.actionbazaar.persistence.Bidder.class, com.actionbazaar.persistence.Item.class).addAsManifestResource("test-persistence.xml", org.jboss.shrinkwrap.api.ArchivePaths.create("persistence.xml"));
}