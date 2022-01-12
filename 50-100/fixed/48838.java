@org.testng.annotations.Test(testName = "Mobile: Verify Radio FocusState", dataProvider = "RadioFocusStateTestData", groups = "mobile")
private void verifyRadioFocusStateMobileTest(java.lang.String radioType, org.openqa.selenium.By element, java.lang.String[] expOutlineColor, java.lang.String expOutlineStyle, java.lang.String expOutlineWidth, java.lang.String[] expOutlineOffset) throws java.lang.Exception {
    java.lang.String elementId = element.toString().substring(7, element.toString().length());
    commonUtils.getUrl(url, "mobile");
    result = verifyRadioFocusState(radioType, element, expOutlineColor, expOutlineStyle, expOutlineWidth, expOutlineOffset, elementId, "mobile");
    org.testng.Assert.assertTrue(result);
}