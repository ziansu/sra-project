@java.lang.Override
protected void onStartUp() {
    mAppController.navigateToInitialLocation();
    mAppController.notifyOrientationChanged(convertOrientation(Configuration.ORIENTATION_UNDEFINED), convertOrientation(getCurrentOrientation()));
}