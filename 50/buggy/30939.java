@java.lang.Override
protected SearchNode createChild(WorldState childState, Action action) {
    return new AStar3DManhattan(this, childState, action, this.getGoalState());
}