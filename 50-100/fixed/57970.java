@java.lang.Override
public org.ggp.base.util.statemachine.MachineState getNextState(org.ggp.base.util.statemachine.MachineState state, java.util.List<org.ggp.base.util.statemachine.Move> moves) throws org.ggp.base.util.statemachine.exceptions.TransitionDefinitionException {
    markActions(moves);
    markBases(state);
    for (org.ggp.base.util.propnet.architecture.components.Proposition p : propNet.getPropositions()) {
        markProposition(p);
    }
    return getStateFromBase();
}