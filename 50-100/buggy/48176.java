private void updateTextView(android.widget.TextView tv, java.lang.Number n, java.lang.String unit) {
    if (unit.contentEquals("a"))
        tv.setText(((java.lang.String.format("%.2f", n.doubleValue())) + unit));
    else
        tv.setText(((java.lang.String.format("%.1f", n.doubleValue())) + unit));
    
}