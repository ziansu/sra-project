private java.lang.Float formatValue(java.lang.String value) {
    return java.lang.Float.parseFloat((((value.substring(0, ((value.length()) - 2))) + ".") + (value.substring(2))));
}