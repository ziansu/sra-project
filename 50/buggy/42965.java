@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.yourowndecisionlayout);
    this.getResources().openRawResource(R.raw.decisiontreexml);
    setStartOverBtn();
}