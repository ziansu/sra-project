private void runGame() {
    while ((pp.checkBallActive()) && (pp.getBricksLeft())) {
        pp.ballCalculations(this.appletWidth, this.appletHeight);
        frame.repaint();
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            break;
        }
    } 
    pp.initializeBall();
}