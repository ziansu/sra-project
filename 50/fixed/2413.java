public void init(int indexNameId, byte entityTypeId, long entityId, java.lang.String keyId, int startTime, int endTime, java.lang.Object value) {
    super.init(NeoCommandType.DYN_INDEX_REMOVE_COMMAND, indexNameId, entityTypeId, entityId, keyId, startTime, endTime, value);
}