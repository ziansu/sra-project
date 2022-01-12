public boolean alreadyLogin() {
    java.lang.String student_code = getSharedPreferences(getResources().getString(R.string.login_cache), gopackdev.arrivalpack.MODE_PRIVATE).getString(getResources().getString(R.string.login_token), null);
    if (student_code == null) {
        android.widget.Toast.makeText(this, "null studnet_code", Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(this, "Already logged in!", Toast.LENGTH_SHORT).show();
    }
    return true;
}