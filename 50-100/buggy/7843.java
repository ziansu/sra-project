public void removeDanceSequence(T selectedBeatElem) {
    java.util.UUID danceSequenceID = selectedBeatElem.getDanceSequenceId();
    ch.ethz.asl.dancebots.danceboteditor.model.DanceSequence<T> selectedDanceSequence = mDanceSequences.get(danceSequenceID);
    int danceSequenceLength = selectedDanceSequence.getLength();
    int startIdx = selectedDanceSequence.getStartElement().getBeatPosition();
    int endIdx = startIdx + danceSequenceLength;
    resetElements(startIdx, endIdx);
    mDanceSequences.remove(danceSequenceID);
}