@origamiV2Tests.Test(testName = "Validate knob drag Home and End keys", dataProvider = "Test for Home and End keys", groups = { "desktop-regression" , "desktop-ci" })
private void validateHomeAndEndKeys(origamiV2Tests.By element, origamiV2Tests.Keys key, java.lang.String expSliderVal, java.lang.String expIESliderVal) throws java.lang.Exception {
    java.lang.Thread.sleep(500);
    commonUtils.tabOnElement(element);
    slider.sendKeys(key);
    actSliderVal = commonUtils.getAttributeValue(element, "aria-valuenow");
    if (browser.equals("ie")) {
        isSliderVal = commonUtils.assertValue(actSliderVal, expIESliderVal, "Slider value is not as per the spec");
    }else {
        isSliderVal = commonUtils.assertValue(actSliderVal, expSliderVal, "Slider value is not as per the spec");
    }
    org.testng.Assert.assertTrue(isSliderVal);
}