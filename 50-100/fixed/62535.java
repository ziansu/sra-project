public void rightThumbDirection(double direction) {
    gameControl.setCameraDirection(direction);
    if ((direction > 300) || (direction < 60))
        gameControl.switchSelectedButton(0);
    else
        if ((direction > 120) && (direction < 210))
            gameControl.switchSelectedButton(1);
        
    
}