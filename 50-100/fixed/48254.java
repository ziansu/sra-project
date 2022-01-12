public org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry pickRandomEdgeY(YType yvalue) {
    java.util.ListIterator<org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry> iterator = entries.listIterator();
    while (iterator.hasNext()) {
        org.dama.datasynth.test.matching.EdgeTypePool<XType, YType>.Entry entry = iterator.next();
        if ((entry.yvalue.compareTo(yvalue)) == 0) {
            iterator.remove();
            return entry;
        }
    } 
    return null;
}