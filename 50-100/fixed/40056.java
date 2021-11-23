private long stealAllowed() {
    if ((stealDelay) > 0) {
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