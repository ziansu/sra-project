@org.junit.Test
public void testBrowser() {
    test.SeleniumTest.driver.get(test.SeleniumTest.BASE_URL);
    java.lang.System.out.println(test.SeleniumTest.driver.findElementByName("body"));
    org.junit.Assert.assertEquals("My AngularJS App", test.SeleniumTest.driver.getTitle());
}