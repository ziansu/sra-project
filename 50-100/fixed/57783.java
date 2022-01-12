private boolean nonTrivialElimination(java.lang.String team) {
    assert team != null;
    FlowNetwork fn = this.createFlowNetwork(team);
    new FordFulkerson(fn, 0, ((fn.V()) - 1));
    for (FlowEdge edge : fn.adj(0)) {
        if ((edge.flow()) != (edge.capacity()))
            return true;
        
    }
    return false;
}