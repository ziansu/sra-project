public void addNote(java.lang.String id, com.makalaster.adventurefriends.model.Note note) {
    if ((mNotes) == null) {
        mNotes = new java.util.HashMap<>();
    }
    mNotes.put(id, note);
}