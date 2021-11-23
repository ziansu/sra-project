public boolean testTeammate(ctf.agent.wjc140030Agent.Pos p, boolean relative) {
    ctf.agent.wjc140030Agent.Pos absPos = (relative) ? toAbsPos(p) : p;
    try {
        return (-1.0) == (agentMap.get(absPos.x).get(absPos.y));
    } catch (java.lang.IndexOutOfBoundsException e) {
        return false;
    }
}