private void newRound(boolean fresh) {
    proposal = null;
    currentSize = modkiwi.games.BotRES.MISSION_COUNTS[((NoP) - 5)][round];
    currentProposalMatcher = modkiwi.games.BotRES.P_PROPOSALS[currentSize];
    modkiwi.games.BotRES.LOGGER.info("currentSize = %d, P_PROPOSALS[%d] = /%s/", currentSize, currentSize, currentProposalMatcher.pattern());
    (round)++;
    subround = 0;
    turn = ((turn) + 1) % (NoP);
    step = "proposal";
}