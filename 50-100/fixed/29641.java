@java.lang.Override
public int lastIndexOf(java.lang.Object o) {
    int idx = 0;
    com.ajjpj.afoundation.collection.immutable.AList<T> l = inner;
    int result = -1;
    while (!(l.isEmpty())) {
        if (AEquality.EQUALS.equals(l.head(), o)) {
            result = idx;
        }
        idx += 1;
        l = l.tail();
    } 
    return result;
}