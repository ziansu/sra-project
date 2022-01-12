protected void setMetaData() {
    new us.nineworlds.serenity.core.services.WatchedVideoAsyncTask().execute(videoId);
    boolean showOSD = preferences.getBoolean("internal_player_osd", true);
    if (showOSD) {
        mediaController.show(SerenitySurfaceViewVideoActivity.CONTROLLER_DELAY);
    }
    if ((progressReportingHandler) != null) {
        progressReportingHandler.postDelayed(progressRunnable, 5000);
    }
}