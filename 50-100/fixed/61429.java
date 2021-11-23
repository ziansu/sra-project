private void retrieveBitRate() {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.util.HashMap<java.lang.String, java.lang.String> metadata = new java.util.HashMap<>();
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(radioStation.getListenUrl(), metadata);
            bitRate = mediaMetadataRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_BITRATE);
            android.util.Log.d(net.komiso.otatar.birplayer.RadioPlayerService.LOG_TAG, ("Bitrate: " + (bitRate)));
            sendAlert(RadioPlayerFragment.SEND_BITRATE, bitRate);
        }
    }).start();
}