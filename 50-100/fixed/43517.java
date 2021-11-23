@java.lang.Override
protected final android.graphics.drawable.Drawable doInBackground(final java.lang.Double... params) {
    final fr.cph.chicago.connection.GStreetViewConnect connect = fr.cph.chicago.connection.GStreetViewConnect.getInstance();
    double latitude = params[0];
    double longitude = params[1];
    fr.cph.chicago.util.Util.trackAction(activity, R.string.analytics_category_req, R.string.analytics_action_get_google, R.string.analytics_action_get_google_map_street_view, 0);
    return connect.connect(latitude, longitude);
}