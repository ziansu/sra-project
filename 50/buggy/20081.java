@java.lang.Override
public java.util.ArrayList<com.emc.documentum.dtos.DocumentumObject> getChildren(java.lang.String folderId, int pageNumber, int pageSize) throws com.emc.documentum.exceptions.RepositoryNotAvailableException {
    return com.emc.documentum.transformation.DCD2Transformation.convertD2DocItemObjectList(dcAPI.getChildren(folderId, pageNumber, pageSize));
}