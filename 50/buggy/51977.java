public java.util.List<ftTodoList.Note> getNotes() throws java.sql.SQLException {
    notes = ftTodoList.DatabaseManager.selectNotes(selected);
    return notes;
}