public java.lang.String getReps(android.widget.LinearLayout layout) {
    java.lang.String toReturn = "";
    for (int i = 1; i < 6; i++) {
        android.widget.EditText editText = ((android.widget.EditText) (layout.getChildAt(i)));
        java.lang.String text = editText.getText().toString();
        if (text.trim().equals("")) {
            toReturn += text + " ";
        }
    }
    return toReturn;
}