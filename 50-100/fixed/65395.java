public void setup() {
    size(800, 600, de.fhpotsdam.unfolding.OPENGL);
    map = new de.fhpotsdam.unfolding.UnfoldingMap(this);
    map.zoomAndPanTo(10, new de.fhpotsdam.unfolding.geo.Location(52.5F, 13.4F));
    map.setZoomRange(minZoomLevel, maxZoomLevel);
    map.setTweening(true);
    de.fhpotsdam.unfolding.utils.MapUtils.createDefaultEventDispatcher(this, map);
}