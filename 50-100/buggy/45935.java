private boolean isComplete(java.util.Set<java.lang.Character> sigma) {
    java.util.Set<java.lang.Character> newSigma = new java.util.HashSet<java.lang.Character>();
    newSigma.addAll(sigma);
    newSigma.retainAll(this.getSigma());
    for (java.lang.Character label : newSigma) {
        for (automaton.State state : this.getStates()) {
            if ((transition(state, label)) == null) {
                return false;
            }
        }
    }
    return true;
}