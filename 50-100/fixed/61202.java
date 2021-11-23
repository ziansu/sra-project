public void removeEdge(XType xvalue, YType yvalue) {
    java.util.ListIterator<org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry> iterator = entries.listIterator();
    while (iterator.hasNext()) {
        org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry entry = iterator.next();
        if (((entry.xvalue.compareTo(xvalue)) == 0) && ((entry.yvalue.compareTo(yvalue)) == 0)) {
            iterator.remove();
            return ;
        }
    } 
}