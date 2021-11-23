public static java.lang.String buildLiveUrl(android.content.Context context, int position) {
    android.content.SharedPreferences prefs = new org.dvbviewer.controller.entities.DVBViewerPreferences(context).getStreamPrefs();
    boolean direct = prefs.getBoolean(DVBViewerPreferences.KEY_STREAM_DIRECT, true);
    java.lang.StringBuffer result = new java.lang.StringBuffer();
    if (direct) {
        return org.dvbviewer.controller.ui.fragments.StreamConfig.getDirectUrl(position);
    }else {
        return org.dvbviewer.controller.ui.fragments.StreamConfig.getTranscodedUrl(context, position, prefs);
    }
}