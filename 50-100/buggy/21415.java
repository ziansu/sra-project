public java.lang.String getValidSafeHTML(java.lang.String context, java.lang.String input, int maxLength, boolean allowNull) throws org.owasp.esapi.errors.IntrusionException, org.owasp.esapi.errors.ValidationException {
    org.owasp.esapi.reference.validation.HTMLValidationRule hvr = new org.owasp.esapi.reference.validation.HTMLValidationRule("safehtml", encoder);
    hvr.setMaximumLength(maxLength);
    hvr.setAllowNull(allowNull);
    hvr.setValidateInputAndCanonical(false);
    return hvr.getValid(context, input);
}