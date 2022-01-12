@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    android.util.Log.d("!!!!!!!!!!", "!!!!!!!!!!");
    isactive = preferences.getBoolean("active ", false);
    if (isactive) {
        android.content.Intent intent = new android.content.Intent(this, com.example.gotit.ViewActivity.class);
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.example.gotit.SetActivity.class);
        startActivity(intent);
    }
}