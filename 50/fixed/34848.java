public void makeNavigationSelection(org.labkey.test.BaseWebDriverTest _test) {
    _test.waitForElement(getLinkLocator());
    _test.click(getLinkLocator());
    _test._ext4Helper.waitForMaskToDisappear(30000);
    _test.waitForElement(getExpectedElement());
}