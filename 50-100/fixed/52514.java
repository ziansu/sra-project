private java.lang.Double getPositiveDoubleValue(android.widget.EditText txt) {
    java.lang.Double val;
    try {
        val = new java.lang.Double(txt.getText().toString());
        val = checkNegative(val);
    } catch (java.lang.NumberFormatException ex) {
        val = java.lang.Double.NaN;
    }
    return val;
}