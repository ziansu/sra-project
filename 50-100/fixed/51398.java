public boolean addVertex(geography.GeographicPoint location) {
    boolean result = false;
    if (location != null) {
        if (!(mapGrpList.containsKey(location))) {
            mapGrpList.put(location, new java.util.ArrayList<geography.GeographicPoint>());
            result = true;
        }
    }
    return result;
}