public Main.Player clone() {
    return new Main.Player(playerID, new javax.vecmath.Vector2d(position.x, position.y), new javax.vecmath.Vector2d(velocity.x, velocity.y), new javax.vecmath.Vector2d(goalPosition.x, goalPosition.y));
}