@java.lang.Override
public int getWaypointsIndex() {
    last_heartbeat.set(java.lang.System.currentTimeMillis());
    android.util.Log.i(com.platypus.android.server.VehicleServerImpl.TAG, java.lang.String.format("Current waypoint index = %d", current_waypoint_index));
    return current_waypoint_index.get();
}