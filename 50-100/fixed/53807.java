public void submitNew() {
    ftTodoList.Note add = new ftTodoList.Note(Note.INV_ID, group, name, description, "");
    try {
        ftTodoList.DatabaseManager.insertNote(add);
        selected = group;
        updateNotes();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}