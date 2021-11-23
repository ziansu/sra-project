public double getShowerGals() {
    android.widget.EditText showersEditText = ((android.widget.EditText) (findViewById(R.id.shower_min_number)));
    java.lang.String showersString = showersEditText.getText().toString();
    double showerMin;
    if (showersString.equals("")) {
        showerMin = 0;
    }else {
        showerMin = java.lang.Double.parseDouble(showersString);
        if (showerMin < 0) {
            showerMin = 0;
        }
    }
    return showerMin * 2.5;
}