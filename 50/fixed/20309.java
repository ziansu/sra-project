public void deleteNote(com.example.krysztian.ascribe.model.Note noteToDelete) {
    int index = notes.indexOf(noteToDelete);
    if (index != (-1)) {
        notes.remove(noteToDelete);
        notifyItemRemoved(index);
    }
}