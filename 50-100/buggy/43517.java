@java.lang.Override
protected final android.graphics.drawable.Drawable doInBackground(final java.lang.Double... params) {
    try {
        final fr.cph.chicago.connection.GStreetViewConnect connect = fr.cph.chicago.connection.GStreetViewConnect.getInstance();
        double latitude = params[0];
        double longitude = params[1];
        fr.cph.chicago.util.Util.trackAction(activity, R.string.analytics_category_req, R.string.analytics_action_get_google, R.string.analytics_action_get_google_map_street_view, 0);
        return connect.connect(latitude, longitude);
    } catch (final java.io.IOException e) {
        android.util.Log.e(fr.cph.chicago.task.DisplayGoogleStreetPictureTask.TAG, activity.getString(R.string.message_error_google_street), e);
        return null;
    }
}