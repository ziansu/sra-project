public final void addCleanUpListener(com.jukusoft.rpg.core.asset.AssetCleanUpListener listener) {
    if ((this.refCounter.get()) <= 0) {
        throw new java.lang.IllegalStateException((("You cannot add an cleanUp listener to an asset (id " + (getAssetID())) + "), if asset was already cleaned up."));
    }
    this.cleanUpListenerList.add(listener);
}