private double oppGoal(org.ggp.base.util.statemachine.Role role, org.ggp.base.util.statemachine.MachineState state, org.ggp.base.util.statemachine.StateMachine machine, java.util.List<org.ggp.base.util.statemachine.Move> actions) {
    int sum = 0;
    for (org.ggp.base.util.statemachine.Role opp : roles) {
        try {
            sum += machine.findReward(opp, state);
        } catch (org.ggp.base.util.statemachine.exceptions.GoalDefinitionException e) {
        }
    }
    return sum / (100.0 * (roles.size()));
}