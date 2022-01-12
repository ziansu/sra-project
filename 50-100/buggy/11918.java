private int decideAction() {
    int action = 0;
    setHorizontalVelocity(0.0);
    java.util.Random rand = new java.util.Random();
    actionDuration = ((rand.nextDouble()) * 3.0) + 1.0;
    actionTime = 0.0;
    int randomNum = rand.nextInt(4);
    if (randomNum == 0)
        action = 0;
    
    if (randomNum == 1)
        action = 1;
    
    if (randomNum == 2)
        action = 2;
    
    if (randomNum == 3)
        action = 3;
    
    return action;
}