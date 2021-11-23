@java.lang.Override
protected void onPause() {
    super.onPause();
    changeToPauseFragment();
    isResumeAfterPause = true;
    gcs.sendGameEvent("game_pause", new java.lang.String[]{  });
}