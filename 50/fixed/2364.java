@org.testng.annotations.BeforeMethod
public void before(java.lang.reflect.Method method) throws java.io.IOException {
    com.epam.jdi.uitests.web.settings.WebSettings.initFromProperties();
    init(com.epam.jdi.uitests.web.settings.WebSettings.useDriver(com.epam.jdi.uitests.web.selenium.driver.DriverTypes.CHROME), com.epam.jdi.site.yandex.YandexSite.class);
    init(com.epam.jdi.uitests.web.settings.WebSettings.useDriver(com.epam.jdi.uitests.web.selenium.driver.DriverTypes.CHROME), com.epam.jdi.site.google.GoogleSite.class);
}