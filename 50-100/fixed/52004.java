public boolean deleteNote(com.example.muggi.randombebop.Note note, boolean blue) {
    java.io.File file;
    file = new java.io.File(((((filedir.getPath()) + "/") + (note.getId())) + ".txt"));
    boolean deleted = file.delete();
    return deleted;
}