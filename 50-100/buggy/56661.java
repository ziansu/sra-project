@org.junit.Before
public void testConnectionProfile() {
    importProject(PRJ);
    org.jboss.reddeer.requirements.db.DatabaseConfiguration cfg = dbRequirement.getConfiguration();
    org.jboss.tools.hibernate.reddeer.factory.DriverDefinitionFactory.createDatabaseDefinition(cfg);
    org.jboss.tools.hibernate.reddeer.factory.ConnectionProfileFactory.createConnectionProfile(cfg);
    org.jboss.tools.hibernate.reddeer.factory.ProjectConfigurationFactory.convertProjectToFacetsForm(PRJ);
    org.jboss.tools.hibernate.reddeer.factory.ProjectConfigurationFactory.setProjectFacetForDB(PRJ, cfg);
    org.jboss.tools.hibernate.reddeer.factory.EntityGenerationFactory.generateJPAEntities(cfg, PRJ, "org.gen", "4.3", false);
}