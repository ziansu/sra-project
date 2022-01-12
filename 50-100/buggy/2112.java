public float getSatisfaction() {
    final java.util.Map<iagl.idl.simulation.mas.environment.Coordinate, iagl.idl.simulation.mas.agent.segregation.SegregationAgent> neighbors = environment.getAllNeighbors(this);
    int compatibility = 0;
    for (iagl.idl.simulation.mas.agent.segregation.SegregationAgent agent : neighbors.values()) {
        if ((agent != null) && (agent.color.equals(color))) {
            compatibility++;
        }
    }
    compatibility = (compatibility * 100) / 8;
    return compatibility;
}