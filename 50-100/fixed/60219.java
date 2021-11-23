public com.wikia.webdriver.pageobjectsfactory.pageobject.adsbase.AdsBaseObject verifyAdImage(java.lang.String slotName, java.lang.String src, java.lang.String imageUrl) {
    org.openqa.selenium.WebElement element = getIframe(slotName, src);
    try {
        com.wikia.webdriver.common.core.Assertion.assertTrue(new com.wikia.webdriver.pageobjectsfactory.pageobject.adsbase.helpers.AdsComparison().compareImageWithScreenshot(imageUrl, element, driver));
        com.wikia.webdriver.common.logging.PageObjectLogging.log("verifyAdImage", "Ad looks good", true, driver);
    } catch (java.lang.AssertionError e) {
        com.wikia.webdriver.common.logging.PageObjectLogging.log("verifyAdImage", "The image is different than the sample", false, driver);
        throw e;
    }
    return this;
}