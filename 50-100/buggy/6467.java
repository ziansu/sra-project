private void saveNoteToDB() {
    java.lang.System.out.println("Command clicked: Saved");
    Note note = createNote();
    if (note != null) {
        java.lang.System.out.println(("Saving: " + (note.toString())));
        byte[] record = ByteUtils.toByteArray(note);
        RecordStoreManager.getInstance().saveRecord(record);
        callback.onListUpdate();
    }
}