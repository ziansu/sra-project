public void setWindow(model.common.Poi poi) {
    closeAllWindows();
    view.travel.InfoWindow window = new view.travel.InfoWindow(map);
    window.setContent(poi.getName());
    view.travel.Marker marker = null;
    for (model.common.Pair<view.travel.Marker, model.common.Poi> pair : markerList) {
        if (pair.getValue().equals(poi)) {
            marker = pair.getKey();
        }
    }
    window.open(map, marker);
    windowList.add(window);
}