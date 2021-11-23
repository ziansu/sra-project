public synchronized boolean activateShape(boolean activate, int shapeNumber) {
    if (activate) {
        if ((stateComponent.activeShapes[shapeNumber]) == null) {
            stateComponent.activeShapes[shapeNumber] = stateComponent.previousActiveShapes[shapeNumber];
            stateComponent.previousActiveShapes[shapeNumber] = null;
            return true;
        }
        return false;
    }else {
        if ((stateComponent.activeShapes[shapeNumber]) != null) {
            stateComponent.previousActiveShapes[shapeNumber] = stateComponent.activeShapes[shapeNumber];
            stateComponent.activeShapes[shapeNumber] = null;
            return true;
        }
        return false;
    }
}