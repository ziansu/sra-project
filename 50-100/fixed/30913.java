@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_project);
    initViews();
    initValues();
    android.content.SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("AppPref", 0);
    setTextSize(sharedPreferences.getFloat("TextSize", getResources().getDimension(R.dimen.defaultTextSize)));
}