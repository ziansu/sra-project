private void ok() {
    if ((builder.locationNameListener) != null) {
        builder.locationNameListener.getLatLng(latLngLocation);
        builder.locationNameListener.locationName(locationET.getText().toString().trim());
        builder.locationNameListener.placeId(place_id);
    }
    dismiss();
}