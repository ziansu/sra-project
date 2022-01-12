@java.lang.Override
public java.util.Iterator<V> iterator() {
    return new org.talend.designer.components.hashfile.memory.NotRemovingIterator<V>(firstMetCache.iterator());
}