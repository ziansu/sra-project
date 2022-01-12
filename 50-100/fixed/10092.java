protected int createNewEntry(java.io.File f) {
    int id = getNextFreeFileID();
    de.tremoneck.timemachine.storage.ReferenceStorage.ReferenceFile file = new de.tremoneck.timemachine.storage.ReferenceStorage.ReferenceFile();
    file.ID = id;
    file.path = f.getPath();
    file.timestamp = f.lastModified();
    file.references = 1;
    list.add(file);
    return id;
}