private int decideAction() {
    setHorizontalVelocity(0.0);
    java.util.Random rand = new java.util.Random();
    actionDuration = ((rand.nextDouble()) * 3.0) + 1.0;
    actionTime = 0.0;
    int randomNum = rand.nextInt(4);
    return randomNum;
}