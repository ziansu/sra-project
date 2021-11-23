private void increment(int startLabel, int relationshipType, int endLabel) {
    int index = arrayIndex(startLabel, relationshipType, endLabel);
    counts.set(index, ((counts.get(index)) + 1));
}