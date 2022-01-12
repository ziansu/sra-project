public org.ggp.base.util.statemachine.MachineState getStateFromBase() {
    java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> contents = new java.util.HashSet<org.ggp.base.util.gdl.grammar.GdlSentence>();
    for (org.ggp.base.util.propnet.architecture.components.Proposition p : propNet.getBasePropositions().values()) {
        p.setValue(p.getSingleInput().getValue());
        if (p.getValue()) {
            contents.add(p.getName());
        }
    }
    return new org.ggp.base.util.statemachine.MachineState(contents);
}