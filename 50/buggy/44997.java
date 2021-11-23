private void resetStealDeadline() {
    if (ibis.constellation.impl.SingleThreadedConstellation.THROTTLE_STEALS) {
        ibis.constellation.impl.SingleThreadedConstellation.logger.info("Resetting steal deadline");
        nextStealDeadline = 0;
    }
}