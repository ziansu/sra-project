public java.util.ArrayList<java.lang.String> getZoneIDs() {
    java.util.ArrayList<java.lang.String> zIDS = new java.util.ArrayList<>();
    zIDS.addAll(zoneMap.keySet());
    return zIDS;
}