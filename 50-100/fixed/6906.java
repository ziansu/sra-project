private void checkBounds() {
    if ((position.x) < 0)
        position.x = 0;
    
    if ((position.x) > 1000)
        position.x = 1000;
    
    if ((position.y) < 10)
        position.y = 10;
    
    if ((position.z) > 0)
        position.z = 0;
    
    if ((position.z) < (-1000))
        position.z = -1000;
    
}