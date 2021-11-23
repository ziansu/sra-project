public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if (user != null) {
        startService(serviceIntent);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Wrong username/password combo", Toast.LENGTH_LONG).show();
    }
}