public int getAttachmentCount(uk.ac.ucl.excites.sapelli.storage.model.Record record) {
    java.util.List<java.lang.Long> currentOffsets = getCurrentAttachmentOffsets(record);
    return currentOffsets != null ? currentOffsets.size() : 0;
}