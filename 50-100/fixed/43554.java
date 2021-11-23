public static java.lang.String getFieldValues(java.lang.String[] fieldValue) {
    java.lang.StringBuffer fieldValues = new java.lang.StringBuffer();
    if ((fieldValue != null) && ((fieldValue.length) > 1)) {
        for (java.lang.String val : fieldValue) {
            fieldValues.append(val);
        }
    }
    return fieldValues.toString();
}