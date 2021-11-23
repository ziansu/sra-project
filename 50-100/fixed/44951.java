@org.greenrobot.eventbus.Subscribe
public void onOdorReportEvent(edu.gatech.cs.environmentalodors.events.OdorReportEvent odorReportEvent) {
    android.util.Log.v(edu.gatech.cs.environmentalodors.MapsActivity.TAG, "Received an odor report event");
    edu.gatech.cs.environmentalodors.models.OdorEvent odorEvent = new edu.gatech.cs.environmentalodors.models.OdorEvent(odorReportEvent.odorReport);
    edu.gatech.cs.environmentalodors.ApplicationState.getInstance().addOdorEvent(odorEvent);
    map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(odorReportEvent.odorReport.location).title("Odor Report")).setTag(odorReportEvent.odorReport.uuid);
    updateMap();
}