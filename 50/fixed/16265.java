public void stop() {
    if (state)
        stopTime = java.lang.System.nanoTime();
    
    state = false;
}