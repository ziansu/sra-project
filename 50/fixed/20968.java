public boolean isPositive() {
    switch (encoding) {
        case konstructs.api.Direction.UP_ENCODING :
        case konstructs.api.Direction.RIGHT_ENCODING :
        case konstructs.api.Direction.BACKWARD_ENCODING :
            return true;
        case konstructs.api.Direction.DOWN_ENCODING :
        case konstructs.api.Direction.LEFT_ENCODING :
        case konstructs.api.Direction.FORWARD_ENCODING :
            return false;
        default :
            throw new java.lang.IllegalStateException("No such direction");
    }
}