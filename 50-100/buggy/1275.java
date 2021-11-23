private void syncModel() {
    if ((getSwlat()) == 37.41802693231111) {
        initBounds();
    }
    if ((_model) != null)
        onMapDataChange(new org.zkoss.gmaps.event.MapDataEvent(_model, org.zkoss.gmaps.event.MapDataEvent.BOUNDS_CHANGED, _model.getItemsIn(getSwlat(), getSwlng(), getNelat(), getNelng(), getLat(), getLng(), _zoom)));
    
}