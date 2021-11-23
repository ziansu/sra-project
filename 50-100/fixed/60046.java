private java.lang.Float formatValue(java.lang.String value) {
    if ((value.length()) > 1) {
        return java.lang.Float.parseFloat((((value.substring(0, ((value.length()) - 2))) + ".") + (value.substring(2))));
    }else {
        return java.lang.Float.parseFloat(value);
    }
}