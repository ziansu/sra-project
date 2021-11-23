public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if (user != null) {
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Wrong username/password combo", Toast.LENGTH_LONG).show();
    }
}