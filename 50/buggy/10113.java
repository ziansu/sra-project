public synchronized boolean moveShapeDown(int position) {
    boolean retVar = moveShapeDown(stateComponent.activeShapes[position]);
    if (retVar)
        putActiveShapeGhosts();
    
    return retVar;
}