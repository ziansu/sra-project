@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splashscreen);
    try {
        handleSetUp();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}