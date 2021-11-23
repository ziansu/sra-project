@java.lang.Override
public int indexOf(java.lang.Object o) {
    int idx = 0;
    com.ajjpj.afoundation.collection.immutable.AList<T> l = inner;
    while (!(inner.isEmpty())) {
        if (AEquality.EQUALS.equals(inner.head(), o)) {
            return idx;
        }
        idx += 1;
        l = l.tail();
    } 
    return -1;
}