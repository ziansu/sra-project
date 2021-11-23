@java.lang.Override
public void timeUp() {
    if (running)
        throw new java.lang.IllegalStateException();
    
    running = false;
}