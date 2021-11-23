@java.lang.Override
public void validate(java.lang.Object target, org.springframework.validation.Errors errors) {
    java.util.Set<javax.validation.ConstraintViolation<java.lang.Object>> constraintViolations = this.beanValidator.validate(target);
    for (javax.validation.ConstraintViolation<java.lang.Object> constraintViolation : constraintViolations) {
        java.lang.String propertyPath = constraintViolation.getPropertyPath().toString();
        java.lang.String message = constraintViolation.getMessage();
        errors.rejectValue(propertyPath, "", message);
    }
}