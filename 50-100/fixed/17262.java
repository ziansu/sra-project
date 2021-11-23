public java.util.Set<org.ggp.base.util.propnet.architecture.components.Proposition> propNext(org.ggp.base.util.statemachine.Move move, org.ggp.base.util.statemachine.MachineState state) {
    markActions(state);
    markBases(state);
    java.util.Set<org.ggp.base.util.propnet.architecture.components.Proposition> nexts = new java.util.HashSet<org.ggp.base.util.propnet.architecture.components.Proposition>();
    for (org.ggp.base.util.propnet.architecture.components.Proposition p : bases.values()) {
        if (propMark(p)) {
            nexts.add(p);
        }
    }
    return nexts;
}