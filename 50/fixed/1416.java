private static java.lang.String getPageSource(org.openqa.selenium.WebDriver driver) {
    return driver.getPageSource().replaceAll("<script", "<textarea style=\"display: none\"><script").replaceAll("</script", "</script></textarea");
}