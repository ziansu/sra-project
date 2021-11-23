protected void on_Pause() {
    try {
        vuforiaAppSession.pauseAR();
    } catch (com.gigigo.vuforiacore.sdkimagerecognition.vuforiaenvironment.VuforiaException e) {
        com.gigigo.ggglogger.GGGLogImpl.log(e.getMessage(), LogLevel.ERROR);
    } catch (java.lang.Throwable tr) {
        com.gigigo.ggglogger.GGGLogImpl.log(tr.getMessage(), LogLevel.ERROR);
    }
    if ((mGlView) != null) {
        mGlView.setVisibility(View.INVISIBLE);
        mGlView.onPause();
    }
}