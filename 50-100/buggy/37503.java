@java.lang.Override
protected void onResume() {
    super.onResume();
    boolean isShowWindow = com.dysania.topactivity.SPUtil.isShowWindow(mContext);
    mSwShowDetails.setChecked(isShowWindow);
    if ((android.os.Build.VERSION.SDK_INT) < (android.os.Build.VERSION_CODES.LOLLIPOP)) {
        if (isShowWindow) {
            startService(mTrackerServiceIntent);
        }
    }else {
        if ((com.dysania.topactivity.TrackerAccessibilityService.getInstance()) == null) {
            mSwShowDetails.setChecked(false);
        }
    }
}