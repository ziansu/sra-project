public void deleteAllSnapshotFiles() {
    newFilePath = ((seedu.multitasky.commons.events.ui.EntryAppRequestEvent.FILE_PATH) + (index)) + ".xml";
    toDelete = new java.io.File(newFilePath);
    ifExists = toDelete.exists();
    while ((ifExists) == true) {
        newFilePath = ((seedu.multitasky.commons.events.ui.EntryAppRequestEvent.FILE_PATH) + (index)) + ".xml";
        toDelete = new java.io.File(newFilePath);
        ifExists = toDelete.exists();
        toDelete.delete();
        (index)++;
    } 
}