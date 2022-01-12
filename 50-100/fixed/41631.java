@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    boolean isFirstTime = isFirst(this);
    setContentView(R.layout.activity_main);
    if (isFirstTime) {
        android.content.Intent intent = new android.content.Intent(this, robomonkeys3402.frcscout.FirstRun.class);
        startActivity(intent);
    }
}