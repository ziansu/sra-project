@java.lang.Override
public void onBackPressed() {
    isBackPress = true;
    if ((fragment) == null) {
        changeToPauseFragment();
        gcs.sendGameEvent("game_pause", new java.lang.String[]{  });
    }
}