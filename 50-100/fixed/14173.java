public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if (user != null) {
        progressDialog.dismiss();
        startSaoLonguinho();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Usuário ou senha errados", Toast.LENGTH_LONG).show();
        progressDialog.dismiss();
    }
}