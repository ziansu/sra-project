@java.lang.Override
protected com.orientechnologies.orient.core.storage.index.sbtreebonsai.local.OSBTreeBonsaiLocal<com.orientechnologies.orient.core.db.record.OIdentifiable, java.lang.Integer> createTree(int clusterId) {
    com.orientechnologies.orient.core.storage.index.sbtreebonsai.local.OSBTreeBonsaiLocal<com.orientechnologies.orient.core.db.record.OIdentifiable, java.lang.Integer> tree = new com.orientechnologies.orient.core.storage.index.sbtreebonsai.local.OSBTreeBonsaiLocal<com.orientechnologies.orient.core.db.record.OIdentifiable, java.lang.Integer>(((FILE_NAME_PREFIX) + clusterId), DEFAULT_EXTENSION, storage);
    tree.create(OLinkSerializer.INSTANCE, OIntegerSerializer.INSTANCE);
    return tree;
}