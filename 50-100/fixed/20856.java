@java.lang.Override
public java.util.Iterator<? extends java.util.Map.Entry<org.apache.accumulo.core.data.Key, org.apache.accumulo.core.data.Value>> apply(org.apache.accumulo.core.data.Key k, org.apache.accumulo.core.data.Value v) {
    org.apache.accumulo.core.data.Key knew;
    if ((pk) == null)
        knew = seekStartKey;
    else {
        knew = edu.mit.ll.graphulo.util.GraphuloUtil.keyCopy(k, pk);
        if ((knew.compareTo(seekStartKey)) < 0)
            return null;
        
    }
    return com.google.common.collect.Iterators.singletonIterator(new java.util.AbstractMap.SimpleImmutableEntry(knew, v));
}