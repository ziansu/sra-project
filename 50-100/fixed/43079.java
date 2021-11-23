void generateRandomPosition() {
    randomRow = ((int) ((java.lang.Math.random()) * ((sideLength) + 1)));
    randomColumn = ((int) ((java.lang.Math.random()) * ((sideLength) + 1)));
    randomPosition = ((int) ((java.lang.Math.random()) * 2));
    if ((randomPosition) == 1) {
        randomBoolPosition = true;
    }else {
        randomBoolPosition = false;
    }
}