public double getBathGals() {
    android.widget.EditText bathsEditText = ((android.widget.EditText) (findViewById(R.id.baths_number)));
    java.lang.String bathsString = bathsEditText.getText().toString();
    double baths;
    if (bathsString.equals("")) {
        baths = 0;
    }else {
        baths = java.lang.Double.parseDouble(bathsString);
        if (baths < 0) {
            baths = 0;
        }
    }
    return baths * 36;
}