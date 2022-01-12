private void resetPinEntry(java.lang.String displayText) {
    android.widget.TextView pinDisplayView = getPinDisplayView();
    android.widget.Button deleteButton = getDeleteButton();
    try {
        pinDisplayView.setText(displayText);
        pinDisplayView.setTransformationMethod(null);
        pinDisplayView.setTextScaleX(1.0F);
        deleteButton.setVisibility(View.INVISIBLE);
    } catch (java.lang.NullPointerException e) {
        android.util.Log.e(com.vitaminbacon.lockscreendialer.LockScreenKeypadPinActivity.TAG, "Incompatible layout with this activity.", e);
        onFatalError();
    }
    mPinEntered = "";
}