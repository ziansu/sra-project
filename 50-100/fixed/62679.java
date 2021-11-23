public final void doMovement(double changeX, double changeY) {
    if ((state) == null) {
        if ((changeX != 0) || (changeY != 0)) {
            setPosition(((cell2d.space.ThinkerObject.getX()) + changeX), ((cell2d.space.ThinkerObject.getY()) + changeY));
        }
    }else {
        collisions.clear();
        collisionDirections.clear();
        displacement.clear();
        displacement = state.move(this, changeX, changeY);
    }
}