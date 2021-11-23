tictactoe.PlayState.PlayState determineFinalOutcome() {
    tictactoe.PlayState.PlayState finalOutcome = playState;
    if ((playState) == null) {
        playState = findCurrentPlayState();
        finalOutcome = playState;
    }
    if ((playState) == (IN_PLAY)) {
        finalOutcome = getPlayersResponse().determineFinalOutcome();
    }
    return finalOutcome;
}