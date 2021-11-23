public void endMove(jumpingalien.model.Direction direction) {
    assert (direction == (Direction.LEFT)) || (direction == (Direction.RIGHT));
    assert isMoving(direction);
    assert !(isMoving(oppositeDirection(direction)));
    setHorVelocity(0);
    setHorDirection(Direction.NULL);
    setHorAcceleration(0);
    getSpritesTimer().reset();
}