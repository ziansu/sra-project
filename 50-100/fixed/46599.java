private void runGame() {
    while (run) {
        checkCollisions();
        removeObjects();
        if ((ball.isLockedToPaddle()) == false) {
            moveBall();
        }
        repaint();
        try {
            java.lang.Thread.sleep(40);
        } catch (java.lang.InterruptedException exception) {
            java.lang.System.out.println("Thread exited due to interruption");
        }
    } 
}