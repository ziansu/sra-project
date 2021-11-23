public void formatEditText(android.widget.EditText editText) {
    if (editText.getText().toString().equals("")) {
        editText.setText("00");
    }else
        if ((editText.length()) == 1) {
            java.lang.String temp = 0 + (editText.getText().toString());
            editText.setText(temp);
        }
    
}