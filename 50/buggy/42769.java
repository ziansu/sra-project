public void verifyPageTitle() {
    org.junit.Assert.assertEquals(driver.getTitle(), "Home page");
    log.info(("Page title is: " + (driver.getTitle())));
}