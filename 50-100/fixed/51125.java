public java.util.Map<java.lang.String, java.lang.String> validate(java.lang.String[] arg) {
    java.util.Map<java.lang.String, java.lang.String> errorMap = new java.util.HashMap();
    validateLengthArgs(arg, errorMap);
    if (errorMap.isEmpty()) {
        com.kamazz.validator.ParameterValidatorImpl.log.info("Length arguments successfully validated.");
        validateMatchRegex(arg, errorMap);
    }
    com.kamazz.validator.ParameterValidatorImpl.log.info("The errorMap was returned.");
    return errorMap;
}