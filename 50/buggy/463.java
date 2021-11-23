@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    context = this;
    android.content.SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
    setLocale(prefs.getString("lang", "undefined"));
}