@org.jboss.arquillian.container.test.api.Deployment
public static org.jboss.shrinkwrap.api.spec.JavaArchive deployment() {
    org.jboss.shrinkwrap.api.spec.JavaArchive archive = org.jboss.shrinkwrap.api.ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.JavaArchive.class, "camel-jpa-test.jar");
    archive.addClass(org.jboss.fuse.persistence.jpa.model.Account.class);
    archive.addAsResource("org/jboss/fuse/persistence/jpa/persistence-local.xml", "META-INF/persistence.xml");
    archive.addAsResource("org/jboss/fuse/persistence/jpa/jpa-camel-context.xml", "META-INF/jboss-camel-context.xml");
    return archive;
}