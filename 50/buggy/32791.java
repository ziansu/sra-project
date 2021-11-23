public org.osmdroid.tileprovider.modules.MapTileModuleProviderBase getNextProvider() {
    mCurrentProvider = mProviderQueue.poll();
    return mCurrentProvider;
}