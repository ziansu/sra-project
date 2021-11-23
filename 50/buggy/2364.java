@org.testng.annotations.BeforeMethod
public void before(java.lang.reflect.Method method) throws java.io.IOException {
    com.epam.jdi.uitests.web.settings.WebSettings.initFromProperties();
    com.epam.jdi.uitests.web.selenium.elements.composite.WebSite.init(com.epam.jdi.site.yandex.YandexSite.class, com.epam.jdi.uitests.web.settings.WebSettings.useDriver(com.epam.jdi.uitests.web.selenium.driver.DriverTypes.CHROME));
    com.epam.jdi.uitests.web.selenium.elements.composite.WebSite.init(com.epam.jdi.site.google.GoogleSite.class, com.epam.jdi.uitests.web.settings.WebSettings.useDriver(com.epam.jdi.uitests.web.selenium.driver.DriverTypes.CHROME));
}