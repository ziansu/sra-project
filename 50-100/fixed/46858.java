private Direction moveTowardsNearestStrawberry() throws EmptyThingException {
    if ((nearestStrawberry.col) < (this.col)) {
        return Direction.LEFT;
    }else
        if ((nearestStrawberry.col) > (this.col)) {
            return Direction.RIGHT;
        }else
            if ((nearestStrawberry.row) < (this.row)) {
                return Direction.UP;
            }else {
                return Direction.DOWN;
            }
        
    
}