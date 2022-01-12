@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String hexadecimalNumber = ((java.lang.String) (hexadecimalText.getText().toString()));
    java.lang.StringBuilder aux = new java.lang.StringBuilder(hexadecimalNumber);
    aux.deleteCharAt(((hexadecimalNumber.length()) - 1));
    hexadecimalText.setText(aux.toString());
}