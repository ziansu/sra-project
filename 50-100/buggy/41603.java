private void checkNewPassword(java.lang.String password, java.lang.String confirmation, org.springframework.validation.Errors errors) {
    boolean arePasswordsEqual = password.equals(confirmation);
    if (arePasswordsEqual) {
        if (org.apache.commons.lang3.StringUtils.isBlank(password)) {
        }else {
            if (!(com.svnavigatoru600.service.util.Password.isValid(password))) {
                errors.rejectValue("newPassword", "password.bad-format");
            }
        }
    }else {
        errors.rejectValue("newPasswordConfirmation", "password.not-same");
    }
}