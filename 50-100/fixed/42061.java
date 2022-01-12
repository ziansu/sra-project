public java.lang.Object getValid(java.lang.String context, java.lang.String input, org.owasp.esapi.ValidationErrorList errorList) throws org.owasp.esapi.errors.ValidationException {
    java.lang.Object valid = null;
    try {
        valid = getValid(context, input);
    } catch (org.owasp.esapi.errors.ValidationException e) {
        if (errorList == null) {
            throw e;
        }else {
            errorList.addError(context, e);
        }
    }
    return valid;
}