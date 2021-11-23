@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.d(com.example.amps.fyp_amps_android_yishan.ProjectDetailsActivity.TAG, "onDestroy()");
    android.os.Bundle savedInstanceState = new android.os.Bundle();
    onSaveInstanceState(savedInstanceState);
}