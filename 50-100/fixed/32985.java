private void setPinDisplayToPasswordView() {
    android.widget.TextView pinDisplayView = getPinDisplayView();
    android.widget.Button deleteButton = getDeleteButton();
    try {
        pinDisplayView.setTransformationMethod(new android.text.method.PasswordTransformationMethod());
        pinDisplayView.setTextScaleX(1.2F);
        deleteButton.setVisibility(View.VISIBLE);
    } catch (java.lang.NullPointerException e) {
        android.util.Log.e(com.vitaminbacon.lockscreendialer.LockScreenKeypadPinActivity.TAG, "Layout is incompatible with activity.", e);
        onFatalError();
    }
}