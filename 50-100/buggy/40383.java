@org.junit.Before
public void setUp() throws java.lang.Exception {
    super.setUp();
    injectInstrumentation(android.support.test.InstrumentationRegistry.getInstrumentation());
    uk.co.ribot.androidboilerplate.data.DataManager dataManager = uk.co.ribot.androidboilerplate.AndroidBoilerplateApplication.get().getDataManager();
    mMockRibotsService = uk.co.ribot.androidboilerplate.BaseTestCase.mock(uk.co.ribot.androidboilerplate.data.remote.RibotsService.class);
    dataManager.setRibotsService(mMockRibotsService);
    dataManager.setScheduler(rx.schedulers.Schedulers.immediate());
    dataManager.getPreferencesHelper().clear();
    dataManager.getDatabaseHelper().clearTables().subscribe();
}