public void moveToPosition(double position) throws java.io.IOException {
    double currentPosition = getPosition();
    if ((currentPosition >= 0) && (currentPosition <= 1)) {
        if (currentPosition > position) {
            logger.debug("Moving jalousie up from {} to {}", currentPosition, position);
            targetPosition = position;
            fullUp();
        }else
            if (currentPosition < position) {
                logger.debug("Moving jalousie down from {} to {}", currentPosition, position);
                targetPosition = position;
                fullDown();
            }
        
    }
}