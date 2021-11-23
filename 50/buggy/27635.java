private void init(org.ggp.base.util.statemachine.MachineState state, java.lang.Object key, Experiment.MTreeNode parent) {
    this.state = state;
    this.heuristic = heuristic(state);
    if (parent != null)
        this.parents.add(parent);
    
}