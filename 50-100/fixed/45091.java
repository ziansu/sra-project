@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Button theBtn = ((android.widget.Button) (v));
    theBtn.setEnabled(false);
    switch (v.getId()) {
        case R.id.grabCoordinatesBtn :
            com.hartsolution.bedrock.Events.getEventBus().post(new com.duckwarlocks.klutz.events.GrabGpsEvent(v));
            break;
        case R.id.saveCoordinatesBtn :
            promptCoordinateName(v);
            break;
    }
    theBtn.setEnabled(true);
}