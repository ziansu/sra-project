private void resetStealDeadline() {
    ibis.constellation.impl.SingleThreadedConstellation.logger.info("Resetting steal deadline");
    nextStealDeadline = 0;
}