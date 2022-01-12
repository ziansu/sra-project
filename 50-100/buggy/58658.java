public boolean testTeammate(ctf.agent.wjc140030Agent.Pos p, boolean relative) {
    try {
        ctf.agent.wjc140030Agent.Pos absPos = (relative) ? toAbsPos(p) : p;
        return 1.0 == (agentMap.get(absPos.x).get(absPos.y));
    } catch (java.lang.IndexOutOfBoundsException e) {
        return true;
    }
}