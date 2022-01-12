public boolean unsetDisabledState() {
    boolean locked = writeLock();
    try {
        int oldFlags = flags;
        updateFlagsNoLock(org.openstreetmap.josm.data.osm.OsmPrimitive.FLAG_DISABLED, false);
        updateFlagsNoLock(org.openstreetmap.josm.data.osm.OsmPrimitive.FLAG_HIDE_IF_DISABLED, false);
        return oldFlags != (flags);
    } finally {
        writeUnlock(locked);
    }
}