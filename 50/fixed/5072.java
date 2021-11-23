public void setGMapType(int mapType) {
    if ((this.mapType) == (nl.rsdt.japp.jotial.maps.wrapper.JotiMap.GOOGLEMAPTYPE)) {
        googleMap.setMapType(mapType);
    }else {
        throw new java.lang.RuntimeException("only supported for googleMaps");
    }
}