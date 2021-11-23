private void runReplay(int loopCount) {
    java.lang.String loopString = (loopCount == (Configuration.LOOP_INFINITELY)) ? "INDEFINITE" : "" + loopCount;
    logger.info("Replay the session %s times", loopString);
    boolean loopAgain = true;
    int loopsCompleted = 0;
    do {
        logger.info("Starting replay loop %d of %s", (loopsCompleted + 1), loopString);
        this.replaySession();
        if ((loopCount != 0) && ((++loopsCompleted) >= loopCount))
            loopAgain = false;
        
    } while (loopAgain );
}