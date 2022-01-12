@java.lang.Override
public void onApiConnected() {
    final com.o3dr.services.android.lib.drone.property.Parameters droneParams = getDrone().getAttribute(AttributeType.PARAMETERS);
    if ((adapter.isEmpty()) && (droneParams != null)) {
        java.util.List<com.o3dr.services.android.lib.drone.property.Parameter> parametersList = droneParams.getParameters();
        if (!(parametersList.isEmpty()))
            loadAdapter(parametersList, false);
        
    }
    toggleParameterFilter(isParameterFilterVisible());
    getBroadcastManager().registerReceiver(broadcastReceiver, org.droidplanner.android.fragments.ParamsFragment.intentFilter);
}