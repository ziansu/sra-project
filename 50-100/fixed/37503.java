@java.lang.Override
protected void onResume() {
    super.onResume();
    mSwShowDetails.setChecked(com.dysania.topactivity.SPUtil.isShowWindow(mContext));
    if (((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.LOLLIPOP)) && ((com.dysania.topactivity.TrackerAccessibilityService.getInstance()) == null)) {
        mSwShowDetails.setChecked(false);
    }
}