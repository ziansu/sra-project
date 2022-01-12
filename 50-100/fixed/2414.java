public java.util.List<java.lang.String> listItems(thredds.server.radarServer2.RadarDataInventory.DirType type) {
    update();
    java.util.Set<java.lang.String> vals = items.get(type);
    if (vals == null) {
        return new java.util.ArrayList<>();
    }else {
        return new java.util.ArrayList<>(vals);
    }
}