private java.util.List<model.stack.ICardStack> addPossibleEmptyPhases(java.util.List<model.stack.ICardStack> phases) {
    int phasesToAdd = 4 - (phases.size());
    for (int i = 0; i < phasesToAdd; i++) {
        phases.add(null);
    }
    return phases;
}