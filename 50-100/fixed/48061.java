private void init() {
    game = getStateMachine();
    role = getRole();
    root = new org.ggp.base.player.gamer.mygamers.MultiNode(getCurrentState(), null, null, 1, 0, true);
    bestPathReversed = new java.util.ArrayList<org.ggp.base.util.statemachine.Move>();
    isSinglePlayer = false;
    bestPathFound = false;
    stepAfterFoundBestMove = 0;
    isSinglePlayer = (game.getRoles().size()) == 1;
}