public void formatEditText(android.widget.EditText editText) {
    if (editText.getText().toString().equals("")) {
        editText.setText(0);
    }else
        if ((editText.length()) == 1) {
            java.lang.String temp = 0 + (editText.getText().toString());
            editText.setText(temp);
        }
    
}