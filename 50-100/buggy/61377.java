private void switchTo(com.esbjon.entities.SteeringEntity.behaviorState newState, com.esbjon.mapobjects.Tile newTarget) {
    steeringBehavior.setEnabled(false);
    switch (newState) {
        case WANDER :
            behaviorWander.setEnabled(true).setWanderOrientation(0.0F);
            steeringBehavior = behaviorWander;
            usePathFinder = false;
            followExactPath = false;
            break;
        case CHASE :
            this.goTo(newTarget, targetEntity.position);
            this.getChaseSpeed(chaseStartTime);
            break;
        default :
    }
    this.state = newState;
    baseSpeed = getBaseSpeed();
    moving = true;
}