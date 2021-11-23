@org.testng.annotations.BeforeMethod
public void setUp() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    fixtures = new com.salesforce.pyplyn.duct.app.AppBootstrapFixtures();
}