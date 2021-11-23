public static java.lang.String getDuration(java.lang.String path, android.content.Context context) {
    android.media.MediaPlayer mp = android.media.MediaPlayer.create(context, android.net.Uri.parse(path));
    int duration = mp.getDuration();
    mp.release();
    return com.developer.alienapps.multimediachanger.Utility.getTimeForTrackFormat(duration);
}