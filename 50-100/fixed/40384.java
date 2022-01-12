protected java.lang.String doInBackground(java.lang.String... args) {
    java.lang.String response = urlChangePassword.changeUserPassword();
    if (response.equalsIgnoreCase("success")) {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.pulego.tshwanesafetymc.MainActivity.class);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "request unsuccessful re-try", Toast.LENGTH_SHORT).show();
    }
    return null;
}