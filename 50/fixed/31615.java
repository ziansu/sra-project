private void addLocations(java.util.List<android.location.Location> ls) {
    if (!(ls.isEmpty()))
        for (android.location.Location l : ls)
            mMap.addMarker(org.tlc.whereat.modules.MapUtils.parseMarker(l));
        
    
}