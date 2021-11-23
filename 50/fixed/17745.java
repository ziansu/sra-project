private int goalProximityHeuristic(org.ggp.base.util.statemachine.Role role, org.ggp.base.util.statemachine.MachineState state) throws org.ggp.base.util.statemachine.exceptions.GoalDefinitionException, org.ggp.base.util.statemachine.exceptions.MoveDefinitionException, org.ggp.base.util.statemachine.exceptions.TransitionDefinitionException {
    return getStateMachine().getGoal(state, role);
}