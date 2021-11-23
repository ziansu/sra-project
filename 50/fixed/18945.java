@java.lang.Override
public void onClick(android.view.View view) {
    com.awchoudhary.bookpocket.BookNote note = new com.awchoudhary.bookpocket.BookNote();
    note.setBookId(book.getId());
    notes.add(note);
    updateEntries(notes);
}