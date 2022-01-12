@com.o3dr.services.android.lib.drone.connection.ConnectionType.Type
public int getConnectionParameterType() {
    @com.o3dr.services.android.lib.drone.connection.ConnectionType.Type
    int connectionType = java.lang.Integer.parseInt(prefs.getString(org.droidplanner.android.utils.prefs.DroidPlannerPrefs.PREF_CONNECTION_TYPE, org.droidplanner.android.utils.prefs.DroidPlannerPrefs.DEFAULT_CONNECTION_TYPE).trim());
    return connectionType;
}