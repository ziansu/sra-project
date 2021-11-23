public final void removeCleanUpListener(com.jukusoft.rpg.core.asset.AssetCleanUpListener listener) {
    java.util.Collections.synchronizedList(this.cleanUpListenerList).remove(listener);
}