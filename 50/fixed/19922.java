public int getAttachmentCount(uk.ac.ucl.excites.sapelli.storage.model.Record record) {
    if (record == null)
        return 0;
    
    java.util.List<java.lang.Long> currentOffsets = getCurrentAttachmentOffsets(record);
    return currentOffsets != null ? currentOffsets.size() : 0;
}