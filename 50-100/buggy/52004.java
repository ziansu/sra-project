public boolean deleteNote(com.example.muggi.randombebop.Note note, boolean blue) {
    java.io.File file;
    if (blue) {
        file = new java.io.File(((((filedir.getPath()) + "/#note") + (note.getId())) + ".txt"));
    }else {
        file = new java.io.File(((((filedir.getPath()) + "/") + (note.getId())) + ".txt"));
    }
    boolean deleted = file.delete();
    return deleted;
}