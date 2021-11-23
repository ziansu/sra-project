@java.lang.Override
public T get(java.lang.Object iKey) {
    final java.lang.Object lastIndexResult = lastIndex.get(iKey);
    final java.util.Set<com.orientechnologies.orient.core.db.record.OIdentifiable> result = new java.util.HashSet<com.orientechnologies.orient.core.db.record.OIdentifiable>();
    if (lastIndexResult != null)
        result.addAll(applyTailIndexes(lastIndexResult));
    
    return ((T) (result));
}