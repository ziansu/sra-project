public void setup() {
    size(1024, 768, de.fhpotsdam.unfolding.examples.misc.P2D);
    map = new de.fhpotsdam.unfolding.UnfoldingMap(this, "myMap");
    map.zoomAndPanTo(new de.fhpotsdam.unfolding.geo.Location(52.5F, 13.4F), 10);
    de.fhpotsdam.unfolding.utils.MapUtils.createDefaultEventDispatcher(this, map);
    debugDisplay = new de.fhpotsdam.unfolding.utils.DebugDisplay(this, map);
}