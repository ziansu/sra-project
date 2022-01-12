private void updateTextView(android.widget.TextView tv, java.lang.Number n, java.lang.String unit) {
    java.lang.String value = "%.1f";
    if (unit.contentEquals("a"))
        value = "%.2f";
    
    tv.setText(((java.lang.String.format(value, n.doubleValue())) + unit));
}