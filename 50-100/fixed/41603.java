private void checkNewPassword(final java.lang.String password, final java.lang.String confirmation, final org.springframework.validation.Errors errors) {
    if (org.apache.commons.lang3.StringUtils.isBlank(password)) {
    }else {
        final boolean arePasswordsEqual = password.equals(confirmation);
        if (!arePasswordsEqual) {
            errors.rejectValue("newPasswordConfirmation", "password.not-same");
        }
        if (!(com.svnavigatoru600.service.util.Password.isValid(password))) {
            errors.rejectValue("newPassword", "password.bad-format");
        }
    }
}