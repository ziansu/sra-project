@java.lang.Override
protected void onResume() {
    super.onResume();
    if (mAskPermissionForLocation) {
        askPermissionForLocation();
    }else {
        android.util.Log.i(com.example.olivi.maphap.LocationActivity.TAG, "mAskPermissionForLocation is false!");
    }
}