private void loadMap() {
    for (minioning.common.services.ITiledLoaderService loader : getITiledLoaderServices()) {
        loader.load(world);
        loader.load(world);
    }
}