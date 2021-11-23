public java.lang.String put(java.lang.String s, java.lang.String v) {
    while ((current.pushCount) > 0) {
        (current.pushCount)--;
        current = new org.apache.batik.dom.util.HashTableStack.Link(current);
    } 
    if ((s.length()) == 0)
        current.defaultStr = v;
    
    return current.table.put(s, v);
}