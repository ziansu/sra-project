public void setMaxPoint(double newMaxPoint) {
    if (newMaxPoint <= (getMinPoint()))
        throw new java.lang.RuntimeException(((("Unexpected newMaxPoint: " + newMaxPoint) + ", expected it to be greater than the current min point: ") + (getMinPoint())));
    
    if (positiveDirection)
        endpoint2 = newMaxPoint;
    else
        endpoint1 = newMaxPoint;
    
    updateDirection();
}