private double getGlobalTokenUsage(final net.onrc.openvirtex.elements.marker.SrtcMarker marker, final net.onrc.openvirtex.elements.datapath.scheduler.MarkerScheduler.BucketType type) {
    long totalLend = getGlobalBucketTotalLend(type);
    long totalBorrowed = getMarkerTotalBorrowed(marker, type);
    log.info("Total Lend={}, Total Borrowed={}", totalLend, totalBorrowed);
    return totalLend > 0 ? ((double) (totalBorrowed)) / ((double) (totalLend)) : 0;
}