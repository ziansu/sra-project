public synchronized void activateShape(boolean activate, int shapeNumber) {
    if (activate) {
        if ((stateComponent.activeShapes[shapeNumber]) == null) {
            stateComponent.activeShapes[shapeNumber] = stateComponent.previousActiveShapes[shapeNumber];
            stateComponent.previousActiveShapes[shapeNumber] = null;
        }
    }else {
        if ((stateComponent.activeShapes[shapeNumber]) != null) {
            stateComponent.previousActiveShapes[shapeNumber] = stateComponent.activeShapes[shapeNumber];
            stateComponent.activeShapes[shapeNumber] = null;
        }
    }
}