public boolean isAcceptable(int group, int agent, int partner) {
    if (partner == (-1)) {
        return true;
    }
    if ((ranks[group][agent][partner]) < (numberOfAgents)) {
        return true;
    }
    return false;
}