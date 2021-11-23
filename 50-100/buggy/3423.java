private void addConflictIfNeeded(java.util.ArrayList<java.util.Set<BoardPair>> conflicts, BoardPair box, int box2Id) {
    if (duplicates.containsKey(box2Id)) {
        BoardPair box2 = duplicates.get(box2Id);
        if (notEqualBoxValue(box, box2)) {
            conflicts.add(new java.util.HashSet<BoardPair>(java.util.Arrays.asList(box, box2)));
        }
    }
}