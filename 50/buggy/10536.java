private void selectOnMap(org.activityinfo.ui.client.component.form.field.map.MapItem mapItem) {
    map.panTo(mapItem.getLatLng());
    map.setView(mapItem.getLatLng(), org.activityinfo.ui.client.component.form.field.map.MapPanel.ZOOM_LEVEL, true);
}