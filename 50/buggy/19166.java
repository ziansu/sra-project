public void start() {
    enableBlock();
    resetMinutes();
    resetFirstSeconds();
    resetLastSeconds();
    isRunning = true;
    tick();
}