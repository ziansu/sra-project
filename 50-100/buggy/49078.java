public void onClick(android.content.DialogInterface dialog, int which) {
    actualSongURI = _Songs.get(which).getPath();
    java.lang.String newMusicURI = _Songs.get(which).getPath();
    android.media.MediaMetadataRetriever metaRetriever = new android.media.MediaMetadataRetriever();
    metaRetriever.setDataSource(newMusicURI);
    java.lang.String durationStr = metaRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
    long duration = java.lang.Long.parseLong(durationStr);
    actualSongLength = ((int) (duration / 1000));
    saveSettings(AlarmConstants.WAKEUP_TIMER, actualAlarm, AlarmConstants.ALARM_NAME);
    dialog.dismiss();
}