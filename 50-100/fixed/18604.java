@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.d(com.example.amps.fyp_amps_android_yishan.ProjectDetailsActivity.TAG, "onStop()");
    if (null != (mAdapter)) {
        ((com.example.amps.fyp_amps_android_yishan.RecyclerViewAdapter) (mAdapter)).clearData();
    }
    android.content.SharedPreferences Details = getSharedPreferences(com.example.amps.fyp_amps_android_yishan.ProjectDetailsActivity.TAG, Context.MODE_PRIVATE);
    if (null != (projectId)) {
    }
}