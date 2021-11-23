public void requestStart() {
    shouldPause = false;
    if (!(running))
        run();
    
}