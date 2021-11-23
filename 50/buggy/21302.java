public void intentToRestartStart() {
    android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
    android.os.StrictMode.setThreadPolicy(policy);
    android.content.Intent restartIntent = new android.content.Intent(this, com.example.crimson30.cardczar.MainActivity.class);
    startActivity(restartIntent);
}