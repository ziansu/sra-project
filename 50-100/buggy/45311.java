private long getGlobalBucketTotalLend(final net.onrc.openvirtex.elements.datapath.scheduler.MarkerScheduler.BucketType type) {
    net.onrc.openvirtex.elements.marker.SrtcMarker globalMarker = ((net.onrc.openvirtex.elements.marker.SrtcMarker) (sw.getMarker(OFMarker.OFPM_GLOBAL.getValue())));
    if (globalMarker == null) {
        log.fatal("globalMarker is NULL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return 0;
    }
    return getMarkerTotalBorrowed(globalMarker, type);
}