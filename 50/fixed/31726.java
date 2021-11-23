public Main.Player clone() {
    return new Main.Player(playerID, new javax.vecmath.Vector2d(position), new javax.vecmath.Vector2d(velocity), new javax.vecmath.Vector2d(goalPosition));
}