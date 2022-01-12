public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String login = editText.getText().toString();
    if (!(login.equals(""))) {
        requestSearchUsersByLogin(login);
        dialog.dismiss();
    }else
        android.widget.Toast.makeText(this, "It was necessary to enter login.", Toast.LENGTH_LONG).show();
    
}