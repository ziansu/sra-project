public boolean entranceIsBlocked(deadlybanquet.model.Direction origin) {
    for (deadlybanquet.model.Door d : doors) {
        if ((d.getDirection()) == (deadlybanquet.model.Direction.getOppositeDirection(origin))) {
            deadlybanquet.model.Position pos = deadlybanquet.model.Position.getAdjacentPositionInDirection(d.getPos(), origin);
            java.lang.System.out.println(pos.toString());
            return isBlocked(pos.getX(), pos.getY());
        }
    }
    return true;
}