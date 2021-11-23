public final boolean contains(double lat, double lng) {
    if ((((lat > (southLat)) && (lat <= (northLat))) && (lng > (westLng))) && (lng <= (eastLng)))
        return true;
    else
        return false;
    
}