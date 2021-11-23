public <T extends com.tascape.reactor.webui.driver.WebFragment> T show(org.openqa.selenium.WebElement element, java.lang.Class<T> fragmentClass) {
    if (element != null) {
        webBrowser.click(element);
    }
    com.tascape.reactor.webui.driver.WebFragment fragment = org.openqa.selenium.support.PageFactory.initElements(webBrowser.getWebDriver(), fragmentClass);
    fragment.setPage(this);
    fragment.load();
    return fragmentClass.cast(fragment);
}