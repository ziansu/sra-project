static void create(io.realm.Realm realm, java.lang.String noteText) {
    com.odinuts.memo.model.Parent parent = realm.where(com.odinuts.memo.model.Parent.class).findFirst();
    io.realm.RealmList<com.odinuts.memo.model.Note> notes = parent.getNoteList();
    realm.beginTransaction();
    com.odinuts.memo.model.Note note = realm.createObject(com.odinuts.memo.model.Note.class, com.odinuts.memo.model.Note.increment());
    note.setNote(noteText);
    notes.add(note);
    realm.commitTransaction();
}