@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_my_favourite);
    mContext = this;
    mDataListener = this;
    super.onCreate(savedInstanceState);
    initLayout();
}