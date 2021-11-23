public void checkInvalidUsername(ru.fil7.test.hello.user.model.User user) {
    checkInvalidField(username, user.getUsername(), ru.fil7.test.hello.user.selenium.pages.SignUpPage.errorOfusername);
}