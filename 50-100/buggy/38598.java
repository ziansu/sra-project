@java.lang.Override
public void initialize(boolean fresh) {
    scoreGood = 0;
    scoreEvil = 0;
    round = 0;
    turn = -1;
    hasVoted = new boolean[NoP];
    vote = new boolean[NoP];
    if (fresh) {
        sendRoles();
    }
    newRound(fresh);
}