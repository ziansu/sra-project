@java.lang.Override
public org.ggp.base.util.statemachine.MachineState getInitialState() {
    org.ggp.base.util.propnet.architecture.components.Proposition init = propNet.getInitProposition();
    java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> initSet = new java.util.HashSet<org.ggp.base.util.gdl.grammar.GdlSentence>();
    initSet.add(init.getName());
    java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> emptySet = java.util.Collections.emptySet();
    org.ggp.base.util.statemachine.MachineState nextState = getNextState(initSet, emptySet);
    return nextState;
}