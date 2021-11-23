public com.mousebird.maply.LayerThread getLayerThread() {
    synchronized(layerThreads) {
        if ((layerThreads.size()) == 0)
            return null;
        
        return layerThreads.get(0);
    }
}