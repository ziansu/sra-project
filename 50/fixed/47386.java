public void setPhoneStatusBar(com.android.systemui.statusbar.phone.PhoneStatusBar phoneStatusBar) {
    mPhoneStatusBar = phoneStatusBar;
    updateCameraVisibility();
    updateLeftButtonVisibility();
    updateCameraIconColor();
    updatePhoneIconColor();
    updateLockIconColor();
    updateIndicationTextColor();
    updateLeftButtonVisibility();
}