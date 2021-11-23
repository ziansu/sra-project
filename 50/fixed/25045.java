@org.testng.annotations.Test
public void testPageTitle() {
    org.testng.Reporter.log(("Title of the page is: " + (apiDemosHome.title.getText())));
    org.testng.Assert.assertEquals("API Demos", apiDemosHome.title.getText());
}