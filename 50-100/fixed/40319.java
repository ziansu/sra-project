@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.introscreen);
    android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
    fbRef = new com.firebase.client.Firebase(((com.example.isaacwang.stazo_resistance.Resistance) (getApplication())).getFbURL());
}