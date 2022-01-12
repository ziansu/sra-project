private void popup(java.lang.String name) {
    clickFolder("Home");
    delay();
    clickFolder("repair");
    delay();
    clickProcessModel(name);
    delay();
    clickMenuBar("Discover");
    delay();
    clickMenuItem("Extract Variability Specification");
    delay();
    assertTrue(isElementPresent(org.apromore.portal.uitest.By.xpath(SETUP_DIALOG_XPATH)));
}