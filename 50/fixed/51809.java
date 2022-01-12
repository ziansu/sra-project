@java.lang.Override
protected void onPause() {
    super.onPause();
    cn.jpush.android.api.JPushInterface.onPause(this);
}