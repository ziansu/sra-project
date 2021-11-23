@java.lang.Override
public org.kurento.repository.RepositoryItem createRepositoryItem(java.lang.String id) {
    if (!(gridFS.find(id).isEmpty())) {
        throw new org.kurento.repository.DuplicateItemException(id);
    }
    com.mongodb.gridfs.GridFSInputFile dbFile = gridFS.createFile(id);
    dbFile.setId(id);
    return createRepositoryItem(dbFile);
}