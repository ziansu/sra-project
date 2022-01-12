@java.lang.Override
public boolean isTerminal(burlap.mdp.core.state.State s) {
    rl.models.common.MicroRTSState state = ((rl.models.common.MicroRTSState) (s));
    rts.GameState underlying = state.getUnderlyingState();
    return ((underlying.getTime()) >= (timeLimit)) || (underlying.gameover());
}