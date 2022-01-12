@org.junit.Test
public void simpleHibernateUrl() throws java.lang.Exception {
    java.lang.String url = "hibernate:classic:com/example/pojo/Hibernate.cfg.xml";
    liquibase.database.Database database = liquibase.integration.commandline.CommandLineUtils.createDatabaseObject(this.getClass().getClassLoader(), url, null, null, null, null, null, false, false, null, null, null, null, null);
    junit.framework.Assert.assertNotNull(database);
    liquibase.snapshot.DatabaseSnapshot snapshot = liquibase.snapshot.SnapshotGeneratorFactory.getInstance().createSnapshot(CatalogAndSchema.DEFAULT, database, new liquibase.snapshot.SnapshotControl(database));
    liquibase.ext.hibernate.database.HibernateClassicDatabaseTest.assertPojoHibernateMapped(snapshot);
}