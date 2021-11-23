public void gameHasEnded() {
    java.lang.System.out.println("ack I am hit");
    points = level.getPoints();
    updatePoints(points);
    currencyEarned = (points) / 10;
    saveData.setCurrency(((saveData.getCurrency()) + (currencyEarned)));
    saveData.save((("saves/" + (fileName)) + ".sav"));
    gameEndScreenOne = true;
    windSound.play();
}