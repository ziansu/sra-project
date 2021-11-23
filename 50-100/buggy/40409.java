@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    pathfinder.Algorithms.AStarNode aStarNode = ((pathfinder.Algorithms.AStarNode) (o));
    return id.equals(aStarNode.id);
}