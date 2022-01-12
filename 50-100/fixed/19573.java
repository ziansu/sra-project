public void addAttachmentToRecord(java.io.File attachment, uk.ac.ucl.excites.sapelli.storage.model.Record record) {
    if (record == null)
        return ;
    
    if (isMaxAttachmentsReached(record))
        throw new java.lang.IllegalStateException((("Maximum # of attachments (" + (max)) + ") reached."));
    
    long creationTimeOffset = getCreationTimeOffsetFromFile(attachment);
    java.util.List<java.lang.Long> offsets = getCurrentAttachmentOffsets(record);
    if (offsets == null)
        offsets = new java.util.ArrayList<java.lang.Long>();
    
    offsets.add(creationTimeOffset);
    getColumn().storeValue(record, offsets);
}