void updateUI(java.lang.String element, java.lang.String text) {
    switch (element) {
        case Constants.UI.STATUS :
            {
                refreshTitle(text);
                updateActivity(Constants.MESSAGE.MUSIC_TITLE, text);
                break;
            }
        case Constants.UI.BUTTON :
            {
                if (isPlaying)
                    toStopButton();
                else {
                    toPlayButton();
                    updateUI(Constants.UI.STATUS, getString(R.string.default_status));
                }
                updateActivity(Constants.MESSAGE.PLAYER_STATUS, null);
                break;
            }
    }
}