public com.brashmonkey.spriter.file.Reference findReferenceByFileNameAndFolder(java.lang.String fileName, java.lang.String folderName, boolean withoutExtension) {
    com.brashmonkey.spriter.file.Reference[] refs = this.findReferencesByFolderName(folderName);
    for (com.brashmonkey.spriter.file.Reference ref : refs) {
        java.lang.String file = ref.fileName.replaceAll((folderName + "/"), "");
        if (withoutExtension)
            file = file.replaceAll(".png", "");
        
        if (file.equals(fileName))
            return ref;
        
    }
    return null;
}