private static com.emc.documentum.dtos.DocumentumObject createDocumentumObject(java.lang.String baseTypeId) {
    com.emc.documentum.dtos.DocumentumObject documentumObject;
    if (baseTypeId.contains("dm_folder")) {
        documentumObject = new com.emc.documentum.dtos.DocumentumFolder();
    }else
        if (baseTypeId.contains("dm_cabinet")) {
            documentumObject = new com.emc.documentum.dtos.DocumentumCabinet();
        }else
            if (baseTypeId.contains("dm_document")) {
                documentumObject = new com.emc.documentum.dtos.DocumentumDocument();
            }else
                documentumObject = new com.emc.documentum.dtos.DocumentumObject();
            
        
    
    return documentumObject;
}