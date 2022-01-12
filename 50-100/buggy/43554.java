public static java.lang.String getFieldValues(java.lang.String[] fieldValue) {
    java.lang.StringBuilder fieldValues = new java.lang.StringBuilder();
    if ((fieldValues != null) && ((fieldValue.length) > 1)) {
        for (java.lang.String val : fieldValue) {
            fieldValues.append(val);
        }
    }
    return fieldValues.toString();
}