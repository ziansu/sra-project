@org.testng.annotations.BeforeClass
public void beforeSuite() throws java.lang.InterruptedException {
    org.molgenis.data.rest.client.MolgenisClient molgenisClient = org.molgenis.selenium.util.RestApiV1Util.createMolgenisClientApiV1(baseURL, org.molgenis.selenium.test.AnnotatorTest.LOG);
    this.driver = DriverType.FIREFOX.getDriver();
    this.model = new org.molgenis.selenium.model.AnnotatorModel(driver, molgenisClient, org.molgenis.selenium.util.RestApiV1Util.loginRestApiV1(molgenisClient, uid, pwd, org.molgenis.selenium.test.AnnotatorTest.LOG));
    org.molgenis.selenium.util.SignUtil.signIn(this.driver, baseURL, uid, pwd);
}