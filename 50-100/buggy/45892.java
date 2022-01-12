private void ok() {
    if ((builder.locationNameListener) != null) {
        builder.locationNameListener.locationName(locationET.getText().toString().trim());
        builder.locationNameListener.placeId(place_id);
        builder.locationNameListener.getLatLng(latLngLocation);
    }
    dismiss();
}