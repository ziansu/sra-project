public void computeSegmentErrorVector(org.pelizzari.ship.ShipPositionList trainingPosList) throws java.lang.Exception {
    this.trainingPosList = trainingPosList;
    baseTrack.computeTrackSegments();
    for (org.pelizzari.ship.ShipTrackSegment seg : baseTrack.getSegList()) {
        java.util.List<org.pelizzari.ship.ShipPosition> targetPosList = trainingPosList.getPosListInInterval(seg.getTimeInterval());
        seg.setTargetPosList(targetPosList);
        seg.computeDistanceToTargetPositions();
        seg.computeStatsForFitness();
    }
}