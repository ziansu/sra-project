private void addConflictIfNeeded(java.util.ArrayList<java.util.Set<BoardPair>> conflicts, BoardPair box, int box2Id) {
    if (duplicates.containsKey(box2Id)) {
        BoardPair box2 = duplicates.get(box2Id);
        conflicts.add(new java.util.HashSet<BoardPair>(java.util.Arrays.asList(box, box2)));
    }
}