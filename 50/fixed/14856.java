public java.lang.String getValidField(java.lang.String field) {
    return isValidField(field) ? field : getEmptyDefaultField(defaultGender);
}