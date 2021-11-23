private synchronized void openNextDeath() {
    nextElementToDie = sortedElementsSet.first();
    timerTask = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            killNextElement();
        }
    };
    long deathTimeMillis = nextElementToDie.deathTime.toDateTime().getMillis();
    long nowMillis = new org.joda.time.LocalDateTime().toDateTime().getMillis();
    long delay = java.lang.Math.max(0, (deathTimeMillis - nowMillis));
    timer.schedule(timerTask, delay);
}