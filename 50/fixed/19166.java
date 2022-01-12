public void start() {
    if (isRunning)
        return ;
    
    enableBlock();
    resetMinutes();
    resetFirstSeconds();
    resetLastSeconds();
    isRunning = true;
    tick();
}