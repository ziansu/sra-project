public java.io.File getAttachment(uk.ac.ucl.excites.sapelli.collector.io.FileStorageProvider fileStorageProvider, uk.ac.ucl.excites.sapelli.storage.model.Record record, int index) {
    if (record == null)
        return null;
    
    return getAttachmentFromOffset(fileStorageProvider, record, getCreationTimeOffset(record, index));
}