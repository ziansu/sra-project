@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mExpendText = ((android.widget.EditText) (findViewById(R.id.expend_duration)));
    mShowText = ((android.widget.EditText) (findViewById(R.id.show_duration)));
    mAutoLayout = ((com.testcase.modebreakers.myapplication.AutoLayout) (findViewById(R.id.auto_layout)));
    startActivity(new android.content.Intent(this, com.testcase.modebreakers.myapplication.NestedDrawerActivity.class));
}