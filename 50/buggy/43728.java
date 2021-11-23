public void addWarning(java.lang.String a_newWarning) {
    if (((warnings) == null) || (warnings.isEmpty())) {
        warnings = a_newWarning;
    }
    warnings = ((warnings) + ", ") + a_newWarning;
}