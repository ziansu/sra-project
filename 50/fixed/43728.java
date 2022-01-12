public void addWarning(java.lang.String a_newWarning) {
    if (((warnings) == null) || (warnings.isEmpty())) {
        warnings = a_newWarning;
        return ;
    }
    warnings = ((warnings) + ", ") + a_newWarning;
}