private void adjustTagNoteCount(java.lang.String oldLabel, java.lang.String newLabel) {
    if (oldLabel != null) {
        decrementTagNoteCount(oldLabel);
    }
    if (newLabel != null) {
        incrementTagNoteCount(newLabel);
    }
}