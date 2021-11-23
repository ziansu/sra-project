@java.lang.Override
public boolean hasNext() {
    while (((currentIterator) == null) || (!(currentIterator.hasNext()))) {
        if (itFactory.hasNext()) {
            currentIterator = new org.hawk.orientdb.indexes.IndexCursorFactoryNodeIterable(itFactory.next(), graph, klass).iterator();
        }else {
            return false;
        }
    } 
    return ((currentIterator) != null) && (currentIterator.hasNext());
}