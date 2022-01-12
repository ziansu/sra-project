@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    java.lang.System.out.println("started");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_summary_screen);
    grabData();
}