public void refresh() {
    mGraphicOverlay.setDrawRect(isShowDrawRect());
    mGraphicOverlay.setRectColors(getRectColors());
    mGraphicOverlay.setShowText(isShouldShowText());
    mCameraSource.setFocusMode((isAutoFocus() ? Camera.Parameters.FOCUS_MODE_CONTINUOUS_PICTURE : null));
    mCameraSource.setFlashMode((isShowFlash() ? Camera.Parameters.FLASH_MODE_TORCH : Camera.Parameters.FLASH_MODE_OFF));
    mCameraSource.setColorsInverted(isShouldInvert());
}