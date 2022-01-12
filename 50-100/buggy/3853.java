private void calculateSwipeDirection() {
    float xDiff = (x2) - (x1);
    float yDiff = (y2) - (y1);
    if ((java.lang.Math.abs(yDiff)) > (java.lang.Math.abs(xDiff))) {
        if (yDiff < 0) {
            direction = 0;
        }else {
            direction = 2;
        }
    }else {
        if (xDiff < 0) {
            direction = 3;
        }else {
            direction = 1;
        }
    }
}