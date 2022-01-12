@java.lang.Override
public com.gemstone.gemfire.internal.concurrent.SkipListNode<java.lang.Object, java.lang.Object> newNode(java.lang.Object key, java.lang.Object value, com.gemstone.gemfire.internal.concurrent.SkipListNode<java.lang.Object, java.lang.Object> next) {
    final com.pivotal.gemfirexd.internal.engine.store.CompactCompositeIndexKey ccik;
    if (key != null) {
        ccik = ((com.pivotal.gemfirexd.internal.engine.store.CompactCompositeIndexKey) (key));
    }else {
        ccik = new com.pivotal.gemfirexd.internal.engine.store.CompactCompositeIndexKey(((java.lang.Object) (null)), ((com.pivotal.gemfirexd.internal.engine.sql.catalog.ExtraIndexInfo) (null)));
    }
    ccik.mapValue = value;
    ccik.next = ((com.pivotal.gemfirexd.internal.engine.store.CompactCompositeIndexKey) (next));
    return ccik;
}