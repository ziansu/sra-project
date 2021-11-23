public void removeAttachmentFromRecord(java.io.File attachment, uk.ac.ucl.excites.sapelli.storage.model.Record record) {
    long creationTimeOffset = getCreationTimeOffsetFromFile(attachment);
    java.util.List<java.lang.Long> offsets = getCurrentAttachmentOffsets(record);
    if (offsets != null) {
        if (offsets.remove(creationTimeOffset)) {
            if (offsets.isEmpty())
                getColumn().clearValue(record);
            else
                getColumn().storeValue(record, offsets);
            
        }else
            java.lang.System.err.println("Specified attachment could not be found for deletion.");
        
    }
}