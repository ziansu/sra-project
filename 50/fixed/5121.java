public void decreaseDistance(int decrement) {
    distance -= decrement;
    if ((distance) < 1) {
        distance = 1;
    }
}