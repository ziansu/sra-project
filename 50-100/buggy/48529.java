@org.testng.annotations.BeforeClass
public static void setUp() throws java.lang.Exception {
    org.roda.core.index.PermissionsRecursiveTest.basePath = org.roda.core.TestsHelper.createBaseTempDir(org.roda.core.index.PermissionsRecursiveTest.class, true);
    boolean deploySolr = true;
    boolean deployLdap = true;
    boolean deployFolderMonitor = false;
    boolean deployOrchestrator = true;
    boolean deployPluginManager = true;
    boolean deployDefaultResources = true;
    org.roda.core.RodaCoreFactory.instantiateTest(deploySolr, deployLdap, deployFolderMonitor, deployOrchestrator, deployPluginManager, deployDefaultResources);
    org.roda.core.index.PermissionsRecursiveTest.model = org.roda.core.RodaCoreFactory.getModelService();
    org.roda.core.index.PermissionsRecursiveTest.index = org.roda.core.RodaCoreFactory.getIndexService();
    org.roda.core.index.PermissionsRecursiveTest.LOGGER.debug("Running index tests under storage {}", org.roda.core.index.PermissionsRecursiveTest.basePath);
}