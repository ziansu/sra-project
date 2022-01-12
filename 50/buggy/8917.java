public boolean isValid(java.lang.CharSequence value, javax.validation.ConstraintValidatorContext context) {
    if (value == null) {
        return true;
    }
    return (value.toString().trim().length()) > 0;
}