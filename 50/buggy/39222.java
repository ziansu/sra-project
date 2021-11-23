public boolean takeStep() {
    if (canMoveLeft())
        turnLeft();
    else
        if (!(canMoveForward()))
            turnRight();
        else
            moveForward();
        
    
    return isAnExit();
}