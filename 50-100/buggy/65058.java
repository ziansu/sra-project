public void update() {
    watchForStart();
    if (!(started))
        return ;
    
    watchForPause();
    watchForReset();
    if (paused)
        return ;
    
    if (gameover)
        return ;
    
    bird.update();
    movePipes();
    checkForCollisions();
}