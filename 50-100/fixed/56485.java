public java.lang.String[] getFieldValues() {
    return fieldNames.stream().map(( fieldName) -> (fieldValues.get(fieldName)) != null ? fieldValues.get(fieldName).toString() : "").toArray(java.lang.String[]::new);
}