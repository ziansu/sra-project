@org.junit.Test
@ru.yandex.qatools.allure.annotations.Title(value = "01-1 Open main page")
@ru.yandex.qatools.allure.annotations.Features(value = "Main page")
@ru.yandex.qatools.allure.annotations.Stories(value = "As a user open main page")
@ru.yandex.qatools.allure.annotations.Description(value = "As a user open main page and verify page URL, title, header and the presence of 'Login' button")
public void test01_1_MainPage_noLogin() {
    WebDriverTest.driver.manage().window().maximize();
    main.start(WebDriverTest.host);
    main.verifyMain();
    main.verifyLoginButton();
}