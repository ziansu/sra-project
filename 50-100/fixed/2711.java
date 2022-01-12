@java.lang.Override
public void validate(java.lang.Object target, org.springframework.validation.Errors errors) {
    org.springframework.validation.ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "field.required");
    org.springframework.validation.ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required");
    project.models.UserModel user = ((project.models.UserModel) (target));
    if (((user.getPassword()) != null) && ((user.getPassword().length()) < (project.validators.UserValidator.MINIMUM_PASSWORD_LENGTH))) {
        errors.rejectValue("password", "field.min.length", new java.lang.Object[]{ project.validators.UserValidator.MINIMUM_PASSWORD_LENGTH }, "");
    }
}