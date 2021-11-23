public java.lang.String joinValidationErrors(java.lang.String... validationErrors) {
    java.lang.StringBuilder joinedErrors = new java.lang.StringBuilder();
    for (java.lang.String validationError : validationErrors) {
        if (validationError != null) {
            joinedErrors.append(validationError);
            joinedErrors.append(" ");
        }
    }
    java.lang.String joinedErrorString = joinedErrors.toString();
    return joinedErrorString != "" ? joinedErrorString : null;
}