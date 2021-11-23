@java.lang.Override
public com.emc.documentum.dtos.DocumentumFolder createFolderByParentId(java.lang.String ParentId, java.lang.String folderName) throws com.emc.documentum.exceptions.FolderCreationException, com.emc.documentum.exceptions.RepositoryNotAvailableException {
    return com.emc.documentum.transformation.DCD2Transformation.convertD2DocItemObject(dcAPI.createFolder(ParentId, folderName));
}