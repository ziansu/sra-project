@java.lang.Override
public org.ggp.base.util.statemachine.MachineState getInitialState() {
    org.ggp.base.util.propnet.architecture.components.Proposition init = propNet.getInitProposition();
    init.setValue(true);
    java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> emptySet = java.util.Collections.emptySet();
    org.ggp.base.util.statemachine.MachineState nextState = getNextState(emptySet, emptySet);
    init.setValue(false);
    return nextState;
}