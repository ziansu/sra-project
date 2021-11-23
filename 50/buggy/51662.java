public void init(byte indexNameId, java.lang.String key, byte entityType, java.util.Map<java.lang.String, java.lang.String> config) {
    super.init(NeoCommandType.INDEX_CREATE_COMMAND, indexNameId, entityType, 0L, key, 0, 0, null);
    this.config = config;
}