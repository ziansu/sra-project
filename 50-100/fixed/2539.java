@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    settings.saveSettings();
    final int sendValue = seekBar.getProgress();
    if (mGoogleApiClient.isConnected()) {
        new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                sendMessage("/messages/BLOCK_MARGIN", java.lang.String.valueOf(sendValue));
            }
        }).start();
    }
}