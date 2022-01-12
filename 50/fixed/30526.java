private void finishField() {
    ++(index);
    state = db.postgresql.async.messages.StreamingRow.State.INCOMPLETE;
    currentSize = 0;
    currentSoFar = 0;
    fieldBuffer = null;
    decoder = null;
}