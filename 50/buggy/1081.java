public double editTextToDouble(android.widget.EditText et) {
    double db = 0.0;
    db = java.lang.Double.parseDouble(et.getText().toString().replace("$", ""));
    return db;
}