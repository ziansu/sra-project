private int nextEdgeId() {
    edu.ncsu.csc.Galant.logging.LogHelper.enterMethod(getClass(), "nextEdgeId");
    int id = 0;
    if (!(edgeById.isEmpty()))
        id = (edgeById.lastKey()) + 1;
    
    edu.ncsu.csc.Galant.logging.LogHelper.exitMethod(getClass(), ("nextEdgeId, id = " + id));
    return id;
}