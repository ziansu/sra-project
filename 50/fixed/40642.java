public void cleanUp() {
    fromActivity = null;
    if ((timer) != null)
        timer.cancel();
    
}