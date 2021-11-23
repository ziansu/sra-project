@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_demo_selector);
    if ((android.os.Build.VERSION.SDK_INT) >= 11)
        getActionBar().setTitle("Choose Demo Project");
    
    setupChaptersListView();
}