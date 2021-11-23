public void removeEdge(XType xvalue, YType yvalue) {
    java.util.ListIterator<org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry> iterator = entries.listIterator();
    while (iterator.hasNext()) {
        org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry entry = iterator.next();
        if ((entry.xvalue.equals(xvalue)) && (entry.yvalue.equals(yvalue))) {
            iterator.remove();
            return ;
        }
    } 
}