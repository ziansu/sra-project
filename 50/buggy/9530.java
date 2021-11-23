@java.lang.Override
public void onClick(android.view.View v) {
    mCamera = mPreview.changeCamera();
    flashMode = mCamera.getParameters().getFlashMode();
    if ((flashMode) == null) {
        flashEnabled = false;
        flashButton.setSelected(flashEnabled);
    }
}