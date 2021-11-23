private org.ebml.MasterElement createCueTrackPositions(final long positionInFile, final java.util.Collection<java.lang.Integer> trackNumbers) {
    org.ebml.MasterElement cueTrackPositions = MatroskaDocTypes.CueTrackPositions.getInstance();
    for (java.lang.Integer trackNumber : trackNumbers) {
        org.ebml.UnsignedIntegerElement cueTrack = MatroskaDocTypes.CueTrack.getInstance();
        cueTrack.setValue(trackNumber);
        org.ebml.UnsignedIntegerElement cueClusterPosition = MatroskaDocTypes.CueClusterPosition.getInstance();
        cueClusterPosition.setValue(getPositionRelativeToSegmentEbmlElement(positionInFile));
        cueTrackPositions.addChildElement(cueTrack);
        cueTrackPositions.addChildElement(cueClusterPosition);
    }
    return cueTrackPositions;
}