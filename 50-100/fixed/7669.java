public boolean touched(testagent.Agent agent) {
    if (pick)
        return false;
    
    double distance = java.lang.Math.sqrt(((java.lang.Math.pow(((agent.x) - (x)), 2)) + (java.lang.Math.pow(((agent.y) - (y)), 2))));
    return distance <= ((size) / (agentIsSized ? 1 : 2));
}