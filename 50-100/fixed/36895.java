private org.ebml.MasterElement createCueTrackPositions(long positionInFile, int trackNumber) {
    org.ebml.MasterElement cueTrackPositions = MatroskaDocTypes.CueTrackPositions.getInstance();
    org.ebml.UnsignedIntegerElement cueTrack = MatroskaDocTypes.CueTrack.getInstance();
    cueTrack.setValue(trackNumber);
    cueTrackPositions.addChildElement(cueTrack);
    org.ebml.UnsignedIntegerElement cueClusterPosition = MatroskaDocTypes.CueClusterPosition.getInstance();
    cueClusterPosition.setValue(getPositionRelativeToSegmentEbmlElement(positionInFile));
    cueTrackPositions.addChildElement(cueClusterPosition);
    return cueTrackPositions;
}