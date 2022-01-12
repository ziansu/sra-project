public boolean takeStep() {
    if (canMoveLeft())
        turnLeft();
    else
        if (!(canMoveForward()))
            turnRight();
        
    
    moveForward();
    return isAnExit();
}