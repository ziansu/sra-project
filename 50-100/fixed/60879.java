@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_main);
        android.os.Bundle detailsBundle = getIntent().getExtras();
        loadModules();
        createClassLabels();
        setLabelText();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}