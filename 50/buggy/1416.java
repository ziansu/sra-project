private static java.lang.String getPageSource(org.openqa.selenium.WebDriver driver) {
    return com.wikia.webdriver.common.logging.PageObjectLogging.getPageSource(driver).replaceAll("<script", "<textarea style=\"display: none\"><script").replaceAll("</script", "</script></textarea");
}