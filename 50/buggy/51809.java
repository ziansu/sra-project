@java.lang.Override
protected void onPause() {
    super.onStop();
    cn.jpush.android.api.JPushInterface.onPause(this);
}