private static core.Locator btnReportPreview(emerald.portal.enums.ConfigureNew_ConfigReportButton button) {
    return new core.Locator(org.openqa.selenium.By.xpath(button.getPath()), ((button.toString()) + " button"));
}