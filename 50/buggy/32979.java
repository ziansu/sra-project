public void done(com.parse.ParseException e) {
    if (e == null) {
        startService(serviceIntent);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "There was an error signing up.", Toast.LENGTH_LONG).show();
    }
}