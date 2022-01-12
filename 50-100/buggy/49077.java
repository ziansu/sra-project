@java.lang.Override
public org.kurento.repository.RepositoryItem findRepositoryItemById(java.lang.String id) {
    java.util.List<com.mongodb.gridfs.GridFSDBFile> dbFiles = gridFS.find(idQuery(id));
    if ((dbFiles.size()) > 0) {
        if ((dbFiles.size()) > 1) {
            log.warn(("There are several files with the same " + "filename and should be only one"));
        }
        return createRepositoryItem(dbFiles.get(0));
    }
    throw new java.util.NoSuchElementException((("The repository item with id \"" + id) + "\" does not exist"));
}