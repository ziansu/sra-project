@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mButton = ((android.widget.ImageButton) (findViewById(R.id.imgBtnOnOff)));
    mEditUrl = ((android.widget.EditText) (findViewById(R.id.editTextUrl)));
    mEditUrl.setText("192.168.0.6");
    mOnOff = false;
}