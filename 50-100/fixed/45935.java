private boolean isComplete(java.util.Set<java.lang.Character> sigma) {
    for (java.lang.Character label : sigma) {
        for (automaton.State state : this.getStates()) {
            if ((transition(state, label)) == null) {
                return false;
            }
        }
    }
    return true;
}