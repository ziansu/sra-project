public com.app.util.error.Errors validateEntity(java.lang.Object object, com.app.util.error.Errors errors) throws java.lang.Exception {
    java.util.Set<javax.validation.ConstraintViolation<java.lang.Object>> constraintViolationErrors = validator.validate(object);
    java.util.HashMap<java.lang.String, java.lang.String> errorsMap = convertValidationMessages(constraintViolationErrors);
    errors.setFieldErrors(errorsMap);
    if (errors.hasErrors()) {
        throw new com.app.util.error.exception.ApplicationException(errors);
    }
    return errors;
}