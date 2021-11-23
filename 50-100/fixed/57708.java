private Direction moveTowardsNearestMushroom() throws EmptyThingException {
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
        
    
}