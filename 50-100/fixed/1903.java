@java.lang.Override
public void setup() {
    map = new de.fhpotsdam.unfolding.UnfoldingMap(this, "map", 50, 50, 700, 500);
    map.zoomToLevel(2);
    de.fhpotsdam.unfolding.utils.MapUtils.createDefaultEventDispatcher(this, map);
    final java.util.List<de.fhpotsdam.unfolding.data.Feature> features = de.fhpotsdam.unfolding.data.GeoRSSReader.loadData(this, "data/bbc-georss-test.xml");
    final de.fhpotsdam.unfolding.data.MarkerFactory markerFactory = new de.fhpotsdam.unfolding.data.MarkerFactory();
    markerFactory.setPointClass(de.fhpotsdam.unfolding.examples.marker.labelmarker.LabeledMarker.class);
    final java.util.List<de.fhpotsdam.unfolding.marker.Marker> markers = markerFactory.createMarkers(features);
    populateMarkerLabels(markers);
    map.addMarkers(markers);
}