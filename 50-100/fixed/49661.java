@org.jboss.arquillian.container.test.api.Deployment
public static org.jboss.shrinkwrap.api.Archive<?> createDeployment() {
    org.jboss.shrinkwrap.api.spec.WebArchive war = org.jboss.shrinkwrap.api.ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.WebArchive.class, "test.war").addPackage(gov.anl.aps.cdb.test.ItemFacade.class.getPackage()).addClass(gov.anl.aps.cdb.portal.utilities.SessionUtility.class).addPackage(gov.anl.aps.cdb.portal.model.db.entities.Item.class.getPackage()).addAsResource("cdb.portal.properties", "cdb.portal.properties").addAsResource("resources.properties", "resources.properties").addAsResource("persistence.xml", "META-INF/persistence.xml").addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    return war;
}