public final void start() {
    started = false;
    if (isUnregistered())
        register();
    
    startTime = (java.lang.System.nanoTime()) / 1000000;
    afterEnd = false;
}