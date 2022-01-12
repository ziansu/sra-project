private void syncModel() {
    if ((_model) != null)
        onMapDataChange(new org.zkoss.gmaps.event.MapDataEvent(_model, org.zkoss.gmaps.event.MapDataEvent.BOUNDS_CHANGED, _model.getItemsIn(getSwlat(), getSwlng(), getNelat(), getNelng(), getLat(), getLng(), _zoom)));
    
}