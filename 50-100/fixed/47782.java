@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pic_select);
    mContext = this;
    picId = R.drawable.pic1;
    initView();
    android.widget.Toast.makeText(mContext, getString(R.string.long_press_hint), Toast.LENGTH_SHORT).show();
}