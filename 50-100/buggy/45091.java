@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Button theBtn = ((android.widget.Button) (v));
    theBtn.setEnabled(false);
    switch (v.getId()) {
        case R.id.grabCoordinatesBtn :
            getCoordinates(v);
            com.hartsolution.bedrock.Events.getEventBus().post(new com.duckwarlocks.klutz.events.GrabGpsEvent());
            break;
        case R.id.saveCoordinatesBtn :
            promptCoordinateName(v);
            break;
    }
    theBtn.setEnabled(true);
}