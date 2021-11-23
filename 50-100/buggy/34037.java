public final boolean contains(double lat, double lng) {
    if ((((lat <= (northLat)) && (lat > (southLat))) && (lng <= (eastLng))) && (lng > (westLng)))
        return true;
    else
        return false;
    
}