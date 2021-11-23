@java.lang.Override
public org.ggp.base.util.statemachine.Move stateMachineSelectMove(long timeout) throws org.ggp.base.util.statemachine.exceptions.GoalDefinitionException, org.ggp.base.util.statemachine.exceptions.MoveDefinitionException, org.ggp.base.util.statemachine.exceptions.TransitionDefinitionException {
    org.ggp.base.util.statemachine.MachineState state = getCurrentState();
    org.ggp.base.util.statemachine.Role role = getRole();
    java.util.List<org.ggp.base.player.gamer.statemachine.Mikes_angels.node> empty = new java.util.ArrayList<org.ggp.base.player.gamer.statemachine.Mikes_angels.node>();
    org.ggp.base.player.gamer.statemachine.Mikes_angels.node start = makeNode(false, state, 0, 0, null, empty, null, true);
    return bestMoveMCTS(timeout, start, role);
}