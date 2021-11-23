@java.lang.Override
public void onLocationChange(android.location.Location location, gps.fhv.at.gps_hawk.domain.events.NewLocationEventData data) {
    data.setTrack(mCurrentTrack);
    gps.fhv.at.gps_hawk.domain.Waypoint waypoint = gps.fhv.at.gps_hawk.workers.WaypointFactory.getInstance().createWaypoint(location, data);
    android.util.Log.v(Constants.PREFERENCES, ("onLocationChange: " + (waypoint.getProvider())));
    android.content.Intent intent = new android.content.Intent(gps.fhv.at.gps_hawk.Constants.BROADCAST_NEW_WAYPOINT);
    intent.putExtra(Constants.EXTRA_WAYPOINT, waypoint);
    android.support.v4.content.LocalBroadcastManager.getInstance(mContext).sendBroadcast(intent);
}