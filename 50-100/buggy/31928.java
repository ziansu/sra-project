private void updatePQCycleCount(java.util.BitSet cycle) {
    for (int i = cycle.nextSetBit(0); i >= 0; i = cycle.nextSetBit((i + 1))) {
        CustomWeightedEdge edge = integerToEdgeMap.get(i);
        pq.remove(edge);
        edge.increaseCycleCount();
        pq.add(edge);
    }
}