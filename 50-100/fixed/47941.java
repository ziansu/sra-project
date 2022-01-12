public com.mousebird.maply.LayerThread getWorkingThread() {
    int numAvailable = workerThreads.size();
    if (numAvailable == 0)
        return null;
    
    if (numAvailable == 1)
        return workerThreads.get(0);
    
    return workerThreads.get((((lastLayerThreadReturned)++) % numAvailable));
}