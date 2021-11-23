private void updateUIForPlayer() {
    uiThreadHandler.post(new java.lang.Runnable() {
        public void run() {
            if (mFullHeightLayout) {
                java.lang.String playerName = getActivePlayerName();
                if ((playerName != null) && (!("".equals(playerName)))) {
                    mActivity.setTitle(playerName);
                }else {
                    mActivity.setTitle(getText(R.string.app_name));
                }
            }
            poweronButton.setVisible(canPowerOn());
            poweroffButton.setVisible(canPowerOff());
        }
    });
}