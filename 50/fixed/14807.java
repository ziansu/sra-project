@java.lang.Override
public void load(net.citizensnpcs.api.util.DataKey key) {
    for (net.citizensnpcs.api.util.DataKey root : key.getRelative("waypoints").getIntegerSubKeys()) {
        waypoints.add(new net.citizensnpcs.trait.waypoint.Waypoint(net.citizensnpcs.util.StorageUtils.loadLocation(root)));
    }
}