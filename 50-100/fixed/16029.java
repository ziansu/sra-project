@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_test_lungs);
    getSupportActionBar().setTitle("Test lungs");
    doneBtn = ((android.widget.Button) (findViewById(R.id.testLungs_done_button)));
    doneBtn.setOnClickListener(this);
}