public synchronized boolean moveShapeDown(int position) {
    if ((stateComponent.activeShapes[position]) == null)
        return false;
    
    boolean retVar = moveShapeDown(stateComponent.activeShapes[position]);
    if (retVar)
        putActiveShapeGhosts();
    
    return retVar;
}