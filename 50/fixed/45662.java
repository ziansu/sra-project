private long getNextNodeId(student.Nodes.CavernNode location) {
    if (!(pathExists()))
        return getNextMoveFromNewPath();
    
    return getNextPathNodeId();
}