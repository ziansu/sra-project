public void update() {
    watchForStart();
    if (!(started))
        return ;
    
    watchForPause();
    watchForReset();
    if (paused)
        return ;
    
    bird.update();
    if (gameover)
        return ;
    
    movePipes();
    checkForCollisions();
}