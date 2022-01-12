@org.springframework.web.bind.annotation.RequestMapping(value = "/create", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public void create(@org.springframework.web.bind.annotation.RequestBody
minium.developer.config.WebDriversProperties.DeveloperWebDriverProperties webDriverProperties) throws java.io.IOException {
    java.lang.String browserName = ((java.lang.String) (webDriverProperties.getDesiredCapabilities().get("browserName")));
    if ((webDriverProperties.getUrl()) == null) {
        webDriverService.webDriverExists(browserName);
    }
    org.openqa.selenium.WebDriver webDriver = webDriverService.createWebDriver(webDriverProperties);
    delegatorWebDriver.setDelegate(webDriver);
}