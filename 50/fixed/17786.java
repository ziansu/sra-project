public void disableIntervalLoop() {
    if (isIntervalLoop) {
        isIntervalLoop = false;
        setIsLoopMode(preLoopMode);
        autoLoopHandler.removeCallbacks(transformTask);
    }
}