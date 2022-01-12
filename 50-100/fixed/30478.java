public static void updateTitle(java.lang.String filename, java.lang.String newTitle) {
    int i;
    for (i = 1; i < (developingalex.noteal.NoteManager.notesArray.size()); i += 2) {
        if ((developingalex.noteal.NoteManager.notesArray.get(i).compareTo(filename)) == 0) {
            developingalex.noteal.NoteManager.updateTitle((i - 1), newTitle);
            break;
        }
    }
}