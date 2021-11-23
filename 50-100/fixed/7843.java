public void removeDanceSequence(T selectedBeatElem) {
    java.util.UUID danceSequenceID = selectedBeatElem.getDanceSequenceId();
    removeDanceSequence(danceSequenceID, selectedBeatElem.getBeatPosition(), ((selectedBeatElem.getBeatPosition()) + (mDanceSequences.get(danceSequenceID).getLength())));
}