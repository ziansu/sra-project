private java.lang.String comparePassword(java.lang.String string, java.lang.String string2) {
    java.lang.String passwd = null;
    if (string.equals(string2)) {
        passwd = string;
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_SHORT).show();
        txtPassword.setText("");
        txtRe_enterPassword.setText("");
        txtPassword.setFocusable(true);
    }
    return passwd;
}