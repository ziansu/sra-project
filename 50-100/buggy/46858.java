private Direction moveTowardsNearestStrawberry() throws EmptyThingException {
    java.lang.System.out.println("moving towards");
    if ((nearestStrawberry) != null) {
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
            
        
    }else {
        throw new EmptyThingException("No Strawberry nearby");
    }
}