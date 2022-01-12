public void updateWithGridEntry(com.graphhopper.routing.util.probabilistic.GridEntry gridEntry) {
    for (int edge : gridEntry.getEdges()) {
        edgeCache.put(edge, gridEntry);
    }
    synchronized(entries) {
        if (!(entries.add(gridEntry))) {
            for (com.graphhopper.routing.util.probabilistic.GridEntry entry : entries) {
                if (entry.equals(gridEntry)) {
                    entry.updateValues(gridEntry.getValues());
                }
            }
        }
    }
}