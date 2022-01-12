public java.lang.String[] getFieldValues() {
    return ((java.lang.String[]) (fieldNames.stream().map(( fieldName) -> (fieldValues.get(fieldName)) != null ? fieldValues.get(fieldName).toString() : "").toArray()));
}