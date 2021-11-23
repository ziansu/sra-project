@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.SharedPreferences settings = getSharedPreferences(com.example.npuhlmann.moneycounter.MainActivity.PREFS_NAME, 0);
    float summe = settings.getFloat("Summe", 0);
    android.widget.TextView textView = ((android.widget.TextView) (findViewById(R.id.tv_summe)));
    textView.setText(java.lang.String.valueOf(summe));
}