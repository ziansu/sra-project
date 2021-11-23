private java.util.List<model.stack.ICardStack> addPossibleEmptyPhases(java.util.List<model.stack.ICardStack> phases) {
    java.util.List<model.stack.ICardStack> stacks = new java.util.LinkedList<>();
    int phasesToAdd = 4 - (phases.size());
    for (int i = 0; i < phasesToAdd; i++) {
        stacks.add(null);
    }
    return stacks;
}