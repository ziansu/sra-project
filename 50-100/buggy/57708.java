private Direction moveTowardsNearestMushroom() throws EmptyThingException {
    if ((nearestMushroom) != null) {
        if ((nearestMushroom.col) < (this.col)) {
            return Direction.LEFT;
        }else
            if ((nearestMushroom.col) > (this.col)) {
                return Direction.RIGHT;
            }else
                if ((nearestMushroom.row) < (this.row)) {
                    return Direction.UP;
                }else {
                    return Direction.DOWN;
                }
            
        
    }else {
        throw new EmptyThingException("No Mushroom nearby");
    }
}