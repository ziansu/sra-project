public static int getIndexOfIndexedField(java.lang.String fieldName) {
    return java.lang.Integer.parseInt(fieldName.replaceAll(".*\\[", "").replaceAll("\\]", ""));
}