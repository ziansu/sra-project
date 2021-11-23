@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    start(new android.view.View(this));
    atoms[1][1] = atoms[12][6];
}