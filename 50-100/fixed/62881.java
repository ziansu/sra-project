protected double Playout(org.ggp.base.player.gamer.statemachine.XNode n, org.ggp.base.util.statemachine.ThreadStateMachine mac) throws org.ggp.base.util.statemachine.exceptions.GoalDefinitionException, org.ggp.base.util.statemachine.exceptions.MoveDefinitionException, org.ggp.base.util.statemachine.exceptions.TransitionDefinitionException {
    org.apache.lucene.util.OpenBitSet state = n.state;
    while (!(mac.isTerminal(state))) {
        state = mac.getRandomNextState(state);
    } 
    return mac.getGoal(state, self_index);
}