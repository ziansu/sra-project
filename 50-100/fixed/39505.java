protected void on_Resume() {
    if (mIsDroidDevice) {
        this.mActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.mActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    try {
        if ((vuforiaAppSession) != null)
            vuforiaAppSession.resumeAR();
        
    } catch (com.gigigo.vuforiacore.sdkimagerecognition.vuforiaenvironment.VuforiaException e) {
        com.gigigo.ggglogger.GGGLogImpl.log(e.getString(), LogLevel.ERROR);
    }
    if ((mGlView) != null) {
        mGlView.setVisibility(View.VISIBLE);
        mGlView.onResume();
    }
}