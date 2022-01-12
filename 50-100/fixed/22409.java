@java.lang.Override
protected void onCreate(android.os.Bundle arg0) {
    super.onCreate(arg0);
    com.hch.beautyenjoy.MyApplication.addActivity(this);
    setContentView(R.layout.activity_bigimage_layout);
    initView();
    initData();
    if (null != (mRowImage))
        try {
            attachData();
        } catch (java.lang.Exception e) {
            com.hch.beautyenjoy.tools.MyLog.i(TAG, e.toString());
        }
    
    mDetector = new android.view.GestureDetector(this, onGestureListener);
}