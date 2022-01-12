@java.lang.Override
public void registerLayers(net.osmand.plus.activities.MapActivity activity) {
    this.activity = activity;
    if ((audioNotesLayer) != null) {
        activity.getMapView().removeLayer(audioNotesLayer);
    }
    audioNotesLayer = new net.osmand.plus.audionotes.AudioNotesLayer(activity, this);
    activity.getMapView().addLayer(audioNotesLayer, 3.5F);
    registerWidget(activity);
}