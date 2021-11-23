@java.lang.Override
public int getGoal(org.ggp.base.util.statemachine.MachineState state, org.ggp.base.util.statemachine.Role role) throws org.ggp.base.util.statemachine.exceptions.GoalDefinitionException {
    markbases(state, propNet);
    java.util.Set<org.ggp.base.util.propnet.architecture.components.Proposition> rewards = propNet.getGoalPropositions().get(role);
    for (org.ggp.base.util.propnet.architecture.components.Proposition p : rewards) {
        if (propmarkp(p)) {
            return getGoalValue(p);
        }
    }
    throw new org.ggp.base.util.statemachine.exceptions.GoalDefinitionException(state, role);
}