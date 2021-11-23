@java.lang.Override
public org.openqa.selenium.WebDriver webDriver() {
    java.lang.String browser = java.lang.System.getProperty("wl.browser", "htmlunit");
    switch (browser) {
        case "htmlunit" :
            return new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        case "firefox" :
            return new org.openqa.selenium.firefox.FirefoxDriver();
        default :
            throw new java.lang.IllegalStateException((("unknown browser \"" + browser) + "\""));
    }
}