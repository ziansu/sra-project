private void wanderAround() {
    turnRadarRight(360);
    int distance = pickRandomNumber(150);
    if (heads()) {
        ahead(distance);
    }else {
        back(distance);
    }
    int randomDirectionChoice = pickRandomNumber(100);
    if (randomDirectionChoice < 30) {
        int angle = pickRandomNumber(90);
        turnRight(angle);
    }else {
        if (randomDirectionChoice < 60) {
            int angle = pickRandomNumber(90);
            turnLeft(angle);
        }
    }
}