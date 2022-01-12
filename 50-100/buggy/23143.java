public void updatePosition(double acceX, double acceY, double acceZ, double deltaTime) {
    if ((currentTrackingPositionIndex) == (-1)) {
        return ;
    }
    currentVelocity.add(Logic.Velocity.getVelocity(acceX, acceY, acceZ, deltaTime));
    cachedPosition.add(Logic.Position.getPosition(currentVelocity.x, currentVelocity.y, currentVelocity.z, deltaTime));
}