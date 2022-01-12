@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onPoisLoadedEvent(io.mapsquare.osmcontributor.model.events.PoisLoadedEvent event) {
    java.util.List<io.mapsquare.osmcontributor.model.entities.Poi> pois = event.getPois();
    timber.log.Timber.d(("Received event PoisLoaded  : " + (pois.size())));
    forceRefreshPoi = false;
    java.util.List<io.mapsquare.osmcontributor.utils.core.MapElement> mapElements = new java.util.ArrayList(pois.size());
    for (io.mapsquare.osmcontributor.model.entities.Poi poi : pois) {
        mapElements.add(poi);
    }
    onLoaded(mapElements, LocationMarkerView.MarkerType.POI);
}