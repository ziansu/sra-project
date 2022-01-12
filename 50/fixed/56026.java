org.eclipse.birt.chart.render.DeferredCache createSingleDeferredCache() {
    if ((fSingleDC) != null) {
        return fSingleDC;
    }
    fSingleDC = new org.eclipse.birt.chart.render.DeferredCache(fDeviceRenderer, fChart, 0);
    fDeferredCacheList.add(fSingleDC);
    return fSingleDC;
}