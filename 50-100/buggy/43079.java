void generateRandomPosition() {
    randomRow = ((int) ((java.lang.Math.random()) * (sideLength)));
    randomColumn = ((int) ((java.lang.Math.random()) * (sideLength)));
    randomPosition = ((int) ((java.lang.Math.random()) * 2));
    if ((randomPosition) == 1) {
        randomBoolPosition = true;
    }else {
        randomBoolPosition = false;
    }
}