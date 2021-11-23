@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("ONResume::", "Inside On Resume!");
    mTimer = new java.util.Timer();
    mDatasource.open();
}