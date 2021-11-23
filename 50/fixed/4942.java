public void markDirty() {
    if ((world) != null) {
        refinedstorage.api.network.NetworkMasterSavedData.getOrLoad(world).markDirty();
    }
}