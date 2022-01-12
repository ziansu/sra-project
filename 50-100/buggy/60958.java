@java.lang.Override
protected void handleClick() {
    if (mController.isAdvancedSettingsEnabled()) {
        showDetail(true);
    }else {
        mController.setLocationEnabled((!(mController.isLocationEnabled())));
        mEnable.setAllowAnimation(true);
        mDisable.setAllowAnimation(true);
    }
}