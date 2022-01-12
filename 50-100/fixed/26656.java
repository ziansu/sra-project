private void innerResize(com.juliasoft.beedeedee.factories.ResizingAndGarbageCollectedUniqueTable.ResizeData data) {
    java.lang.System.arraycopy(ut, 0, data.newUt, 0, ((nextPos) * (getNodeSize())));
    this.ut = data.newUt;
    this.H = data.newH;
    this.size = data.newSize;
    this.computationCache = data.computationCache;
    this.restrictCache = data.restrictCache;
    this.replaceCache = data.replaceCache;
    this.quantCache = data.quantCache;
    this.equivCache = data.equivCache;
    this.rwlCache = data.rwlCache;
    this.squeezeEquivCache = data.squeezeEquivCache;
    updateHashTable();
}