@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    switch (intent.getAction()) {
        case com.o3dr.services.android.lib.drone.attribute.AttributeEvent.ATTITUDE_UPDATED :
            break;
        case com.o3dr.services.android.lib.drone.attribute.AttributeEvent.STATE_VEHICLE_MODE :
            com.o3dr.services.android.lib.drone.property.State state = dpApp.getDrone().getAttribute(AttributeType.STATE);
            mode = state.getVehicleMode();
            break;
    }
}