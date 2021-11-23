public collisions.CollisionInfo getClosestCollision(shapes.Line trajectory) {
    shapes.Point closestPoint = trajectory.end();
    interfaces.Collidable collidable = null;
    for (interfaces.Collidable c : this.collidables) {
        shapes.Point p = trajectory.closestIntersectionToStartOfLine(c.getCollisionRectangle());
        if (trajectory.isCloserToStart(p, closestPoint)) {
            closestPoint = p;
            collidable = c;
        }
    }
    return new collisions.CollisionInfo(closestPoint, collidable);
}