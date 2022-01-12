private void addMarkersCustomIcon(int i, com.mapbox.mapboxsdk.annotations.Icon icon) {
    com.mapbox.mapboxsdk.annotations.MarkerViewOptions mark = new com.mapbox.mapboxsdk.annotations.MarkerViewOptions().position(new com.mapbox.mapboxsdk.geometry.LatLng(doorsInformationForPins.get(i).getLati(), doorsInformationForPins.get(i).getlongi())).title(doorsInformationForPins.get(i).getTitle()).snippet(doorsInformationForPins.get(i).getDescription()).icon(icon);
    markers.add(mark);
}