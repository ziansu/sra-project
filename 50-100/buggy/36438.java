@java.lang.Override
public java.lang.String toString() {
    final java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (final java.util.Iterator<org.exist.dom.persistent.DocumentImpl> i = getDocumentIterator(); i.hasNext();) {
        result.append(i.next());
        result.append(", ");
    }
    return result.toString();
}