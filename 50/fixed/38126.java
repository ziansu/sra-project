@org.junit.Test
public void testBrowser() {
    test.SeleniumTest.driver.get(test.SeleniumTest.BASE_URL);
    org.junit.Assert.assertEquals("My AngularJS App", test.SeleniumTest.driver.getTitle());
}