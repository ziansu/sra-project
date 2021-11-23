private void nextPointInPath() {
    if ((currentStepInPath) < (path.size())) {
        inBetweenDestination = new java.awt.geom.Point2D.Double(((path.get(currentStepInPath).getX()) * 32), ((path.get(currentStepInPath).getY()) * 32));
        (currentStepInPath)++;
    }else {
    }
}