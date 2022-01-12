private java.lang.Integer getOldestDelta(java.lang.String pname) {
    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, org.bukkit.Location> playerlocs = locs.get(pname);
    if ((playerlocs == null) || (playerlocs.isEmpty())) {
        return null;
    }
    java.util.List<java.lang.Integer> keys = new java.util.ArrayList<java.lang.Integer>(playerlocs.keySet());
    java.util.Collections.sort(keys);
    for (java.lang.Integer minute : keys) {
        return ((getUnixtime()) / 60) - minute;
    }
    return null;
}