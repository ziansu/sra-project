protected double Playout(org.ggp.base.player.gamer.statemachine.XNode n) throws org.ggp.base.util.statemachine.exceptions.GoalDefinitionException, org.ggp.base.util.statemachine.exceptions.MoveDefinitionException, org.ggp.base.util.statemachine.exceptions.TransitionDefinitionException {
    int thread_ind = ((int) ((java.lang.Thread.currentThread().getId()) % (num_threads)));
    org.ggp.base.util.statemachine.ThreadStateMachine mac = thread_machines[thread_ind];
    org.apache.lucene.util.OpenBitSet state = n.state;
    while (!(mac.isTerminal(state))) {
        state = mac.getRandomNextState(state);
    } 
    return mac.getGoal(state, self_index);
}