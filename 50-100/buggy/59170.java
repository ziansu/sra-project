public void moveFolderToBin(cz.cvut.fel.integracniportal.model.Folder folder) {
    if (((fileRepository) instanceof cz.cvut.fel.integracniportal.service.BinFileRepository) == false) {
        throw new java.lang.IllegalStateException("Repository doesn't support bin");
    }
    cz.cvut.fel.integracniportal.service.FolderDefinition folderDef = mapFolder(folder);
    ((cz.cvut.fel.integracniportal.service.BinFileRepository) (fileRepository)).moveFolderToBin(folderDef);
}