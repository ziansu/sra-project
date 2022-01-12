private void saveGesture() {
    if (checkExistingName(mGesturename)) {
        showToast("Gesture name already exists");
        getName(mGesturename);
        return ;
    }
    gestureLibrary.addGesture(mGesturename, mCurrentGesture);
    if (gestureLibrary.save()) {
        showToast((((getString(R.string.gesture_saved)) + (getExternalFilesDir(null))) + "/gesture.txt"));
        android.util.Log.i(com.delphi.gesturerecorder.SaveGestureActivity.TAG, "gesture saved!");
    }
    reDrawGestureView();
}