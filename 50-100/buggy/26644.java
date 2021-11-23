@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ((android.widget.TextView) (this.findViewById(R.id.NameText))).requestFocus();
    com.example.zeid.lab5.MainActivity.preferenceSettings = getPreferences(com.example.zeid.lab5.MainActivity.PREFERENCE_MODE_PRIVATE);
    com.example.zeid.lab5.MainActivity.preferenceEditor = com.example.zeid.lab5.MainActivity.preferenceSettings.edit();
    android.content.Intent intent = new android.content.Intent(this, com.example.zeid.lab5.Main2Activity.class);
    startActivity(intent);
    finish();
}