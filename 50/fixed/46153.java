public java.lang.String checkInvalidUsername(ru.fil7.test.hello.user.model.User user) {
    return checkInvalidField(username, user.getUsername(), ru.fil7.test.hello.user.selenium.pages.SignUpPage.errorOfusername);
}