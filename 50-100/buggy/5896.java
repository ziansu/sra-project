private void playGameRound(com.novoda.pianohero.Note note) {
    if (sequence.isFinal(note)) {
        callback.onSongComplete();
        return ;
    }
    if (sequence.currentNoteIs(note)) {
        this.sequence = sequence.nextPosition();
        callback.onRoundEnd(sequence);
        callback.onRoundSuccess(sequence);
    }else {
        com.novoda.pianohero.Sequence updatedSequence = sequence.error();
        callback.onRoundEnd(updatedSequence);
        callback.onRoundError(updatedSequence);
    }
}