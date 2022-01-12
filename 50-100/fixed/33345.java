@org.junit.Test
public void saveModifiedState() throws java.lang.Exception {
    givenTransactionLogIsEnabled();
    givenCollection(zeCollection).withConstellioRMModule().withAllTestUsers();
    getSaveStateFeature().saveStateAfterTestWithTitle("with_manual_modifications");
    com.constellio.model.services.factories.ModelLayerFactory modelLayerFactory = getModelLayerFactory();
    newWebDriver(loggedAsUserInCollection(admin, zeCollection));
    waitUntilICloseTheBrowsers();
}