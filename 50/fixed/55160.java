@java.lang.Override
public void onClick(android.view.View view) {
    if (mTakePictureBtn.isEnabled()) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
            mTakePictureBtn.setEnabled(false);
            autoFocus();
        }else {
            takePicture();
        }
    }
}