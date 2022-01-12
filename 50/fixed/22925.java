@java.lang.Override
public void setNodeState(com.roboclub.robobuggy.nodes.baseNodes.NodeState state) {
    if (state == null) {
        return ;
    }
    this.state = state;
    lastUpdate = java.lang.System.currentTimeMillis();
}