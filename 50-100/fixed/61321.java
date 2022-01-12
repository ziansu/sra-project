@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new com.zandyl.slidepuzzle.MainActivity.PlaceholderFragment()).commit();
    }
    displaymetrics = new android.util.DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
    com.zandyl.slidepuzzle.MainActivity.height = displaymetrics.heightPixels;
    com.zandyl.slidepuzzle.MainActivity.width = displaymetrics.widthPixels;
}