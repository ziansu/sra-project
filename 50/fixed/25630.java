private void turnRandom(int randTurn) {
    if (randTurn < 6)
        setRotation(0);
    
    if (randTurn < 8)
        setRotation(90);
    
    if (randTurn < 10)
        setRotation(270);
    
}