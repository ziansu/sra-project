private long stealAllowed() {
    if (ibis.constellation.impl.SingleThreadedConstellation.THROTTLE_STEALS) {
        long now = java.lang.System.currentTimeMillis();
        ibis.constellation.impl.SingleThreadedConstellation.logger.info(("nextStealDeadline - now = " + ((nextStealDeadline) - now)));
        if (now >= (nextStealDeadline)) {
            nextStealDeadline = now + (stealDelay);
            return 0;
        }
        return nextStealDeadline;
    }else {
        return 0;
    }
}