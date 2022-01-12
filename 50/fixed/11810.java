public java.lang.String checkInvalidConfirmPassword(ru.fil7.test.hello.user.model.User user) {
    return checkInvalidField(confirmPassword, user.getConfirmPassword(), ru.fil7.test.hello.user.selenium.pages.SignUpPage.errorOfConfirmPassword);
}