public boolean addVertex(geography.GeographicPoint location) {
    boolean result = false;
    if (location != null) {
        if (!(mapGrpList.containsKey(location))) {
            mapGrpList.put(location, null);
            result = true;
        }
    }
    return result;
}