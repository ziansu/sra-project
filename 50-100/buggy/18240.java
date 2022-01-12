public void run() {
    java.lang.Thread thisThread = java.lang.Thread.currentThread();
    while ((runner) == thisThread) {
        repaint();
        (current)++;
        if ((current) >= (totalPictures))
            current = 0;
        
        try {
            java.lang.Thread.sleep(pause);
        } catch (java.lang.InterruptedException e) {
        }
    } 
}