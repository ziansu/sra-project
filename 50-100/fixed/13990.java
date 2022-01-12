private void newRound(boolean fresh) {
    (round)++;
    subround = 0;
    turn = ((turn) + 1) % (NoP);
    currentSize = modkiwi.games.BotRES.MISSION_COUNTS[((NoP) - 5)][round];
    currentProposalMatcher = modkiwi.games.BotRES.P_PROPOSALS[currentSize];
    proposal = null;
    step = "proposal";
}