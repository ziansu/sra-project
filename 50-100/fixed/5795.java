public void inputNumberAppend(java.lang.String i) {
    if (((calcType) == (AppContext.TYPE_BIN)) && ((java.lang.Integer.parseInt(i)) > 1)) {
        android.widget.Toast.makeText(this, R.string.msg_binary_input_error, Toast.LENGTH_SHORT).show();
    }
    if (((calcType) == (AppContext.TYPE_OCT)) && ((java.lang.Integer.parseInt(i)) > 8)) {
        android.widget.Toast.makeText(this, R.string.msg_octonary_input_error, Toast.LENGTH_SHORT).show();
    }
}