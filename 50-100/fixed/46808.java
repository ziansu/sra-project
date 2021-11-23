@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    final java.lang.String action = intent.getAction();
    switch (action) {
        case com.o3dr.services.android.lib.drone.attribute.AttributeEvent.STATE_CONNECTED :
        case com.o3dr.services.android.lib.drone.attribute.AttributeEvent.TYPE_UPDATED :
            com.o3dr.services.android.lib.drone.property.Type type = getDrone().getAttribute(AttributeType.TYPE);
            selectActionsBar(type.getDroneType());
            break;
    }
}