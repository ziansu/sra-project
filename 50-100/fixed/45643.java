@org.junit.Test
@ru.yandex.qatools.allure.annotations.Title(value = "01-2 Open main page by aliases")
@ru.yandex.qatools.allure.annotations.Features(value = "Main page")
@ru.yandex.qatools.allure.annotations.Stories(value = "As a user open main page aliases")
@ru.yandex.qatools.allure.annotations.Description(value = "As a user open main page aliases and verify page URL, title, header and the presence of 'Login' button for each")
public void test01_2_MainPage_noLogin() {
    main.start_home(WebDriverTest.host);
    main.verifyMain(WebDriverTest.host);
    main.verifyLoginButton();
    main.start_main(WebDriverTest.host);
    main.verifyMain(WebDriverTest.host);
    main.verifyLoginButton();
    main.start_index(WebDriverTest.host);
    main.verifyMain(WebDriverTest.host);
    main.verifyLoginButton();
}