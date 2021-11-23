public void removeWarp(java.util.UUID uuid) {
    if (warpList.containsKey(uuid)) {
        popSign(com.wasteofplastic.askyblock.util.Util.getLocationString(((java.lang.String) (warpList.get(uuid)))));
        warpList.remove(uuid);
    }
    saveWarpList(true);
}