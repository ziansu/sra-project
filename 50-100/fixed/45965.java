@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        android.util.Log.d("signOff", "Logging out the user");
        android.content.Intent backToLogin = new android.content.Intent(getApplicationContext(), com.example.abhishek.sharerides.activities.MainActivity.class);
        showCustomProgress(false);
        startActivity(backToLogin);
        finish();
    }
}