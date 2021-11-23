public java.lang.String get(java.lang.String s) {
    if ((s.length()) == 0)
        return current.defaultStr;
    
    for (org.apache.batik.dom.util.HashTableStack.Link l = current; l != null; l = l.next) {
        java.lang.String uri = ((java.lang.String) (l.table.get(s)));
        if (uri != null) {
            return uri;
        }
    }
    return null;
}