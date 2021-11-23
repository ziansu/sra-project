public static java.lang.String getDuration(java.lang.String path, android.content.Context context) {
    if (!(path.isEmpty())) {
        android.media.MediaPlayer mp = android.media.MediaPlayer.create(context, android.net.Uri.parse(path));
        if (mp != null) {
            int duration = mp.getDuration();
            mp.release();
            return com.developer.alienapps.multimediachanger.Utility.getTimeForTrackFormat(duration);
        }
    }
    return com.developer.alienapps.multimediachanger.Utility.getTimeForTrackFormat(0);
}