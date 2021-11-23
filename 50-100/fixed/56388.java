protected void loggingFunction() throws java.io.IOException {
    if ((this.isInteracting) == false) {
        return ;
    }else {
        java.util.Date date = new java.util.Date();
        long current = date.getTime();
        long timestamp = current - (initialTime);
        synchronized(lock) {
            writeLine(timestamp);
        }
        this.isInteracting = false;
    }
}