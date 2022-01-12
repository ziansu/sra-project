@java.lang.Override
public void stateMachineMetaGame(long timeout) throws org.ggp.base.util.statemachine.exceptions.GoalDefinitionException, org.ggp.base.util.statemachine.exceptions.MoveDefinitionException, org.ggp.base.util.statemachine.exceptions.TransitionDefinitionException {
    p(("Metagaming Phase Optimized Propnet: " + (getMatch().getMatchId())));
    init();
    expand(root);
    long start = java.lang.System.currentTimeMillis();
    finishBy = timeout - 5000;
    performMCTS(root);
    timeToDepthCharge = ((java.lang.System.currentTimeMillis()) - start) / (numDepthCharges);
    p(("time to depth charge: " + (timeToDepthCharge)));
}