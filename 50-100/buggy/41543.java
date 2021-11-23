public static android.content.Intent getDirectUrl(int position, boolean recording) {
    java.lang.StringBuilder result = new java.lang.StringBuilder((recording ? org.dvbviewer.controller.ui.fragments.StreamConfig.mediaUrl : org.dvbviewer.controller.ui.fragments.StreamConfig.liveUrl)).append((position + ".ts"));
    android.util.Log.d(org.dvbviewer.controller.ui.fragments.StreamConfig.Tag, ("playing video: " + (result.toString())));
    android.content.Intent videoIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW);
    videoIntent.setDataAndType(android.net.Uri.parse(result.toString()), "video/mpeg");
    return videoIntent;
}