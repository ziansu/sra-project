protected void setArriveTarget(com.badlogic.gdx.ai.utils.Location<com.badlogic.gdx.math.Vector2> targetLocation) {
    this.setMoving(true);
    checkArrive = false;
    steeringBehavior.setEnabled(false);
    if ((behaviorArrive) == null)
        this.setupArrive(targetLocation);
    else
        behaviorArrive.setTarget(targetLocation);
    
    behaviorArrive.setEnabled(true);
    steeringBehavior = behaviorArrive;
}