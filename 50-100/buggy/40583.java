public java.util.LinkedList<searchclient.Node> findSolution() {
    java.util.LinkedList<searchclient.Node> solution = new java.util.LinkedList<searchclient.Node>();
    updateGoalStates(this.state);
    searchclient.Node thePlan = findHighestPlan(this.agent, this.state);
    searchclient.Strategy strategy = new searchclient.Strategy.StrategyBFS();
    strategy.clearFrontier();
    updateGoalStates(this.state);
    solution = implementHighPlan(thePlan, this.state, strategy);
    return solution;
}