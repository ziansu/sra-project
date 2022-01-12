public void addNote(java.lang.String noteId, com.makalaster.adventurefriends.model.Note note) {
    if ((mNotes) == null) {
        mNotes = new java.util.HashMap<>();
    }
    mNotes.put(noteId, note);
}