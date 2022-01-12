public void onResourceManagerReloaded() {
    for (java.util.Iterator<java.lang.ref.WeakReference<com.github.worldsender.mcanm.common.resource.MinecraftResourceLocation>> it = allIssuedLocations.iterator(); it.hasNext();) {
        com.github.worldsender.mcanm.common.resource.MinecraftResourceLocation resLoc = it.next().get();
        if (resLoc == null) {
            it.remove();
        }
        resLoc.triggerReload();
    }
}