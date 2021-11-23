public org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry pickRandomEdgeX(XType xvalue) {
    java.util.ListIterator<org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry> iterator = entries.listIterator();
    while (iterator.hasNext()) {
        org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry entry = iterator.next();
        if (entry.xvalue.equals(xvalue)) {
            iterator.remove();
            return entry;
        }
    } 
    return null;
}