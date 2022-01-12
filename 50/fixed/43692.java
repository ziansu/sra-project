private void attemptToAdd(java.util.ArrayList sorted, java.lang.Object stack) {
    if (passesFilters(stack)) {
        if (!(sorted.contains(stack))) {
            sorted.add(stack);
        }
    }
}