void updateUI(java.lang.String text) {
    if (text != null) {
        refreshTitle(text);
    }
    if (isPlaying) {
        updateActivity(text);
        toStopButton();
    }else {
        refreshTitle(getString(R.string.default_status));
        updateActivity(null);
        toPlayButton();
    }
}