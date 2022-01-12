public boolean entranceIsBlocked(deadlybanquet.model.Direction origin) {
    for (deadlybanquet.model.Door d : doors) {
        if ((d.getDirection()) == (deadlybanquet.model.Direction.getOppositeDirection(origin))) {
            deadlybanquet.model.Position pos = deadlybanquet.model.Position.getAdjacentPositionInDirection(d.getPos(), origin);
            return isBlocked(pos.getX(), ((pos.getY()) + 1));
        }
    }
    return true;
}