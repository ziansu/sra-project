public void run(int duration, double startTime, com.github.a2g.core.platforms.java.animation.Element element) {
    isRunning = true;
    isStarted = false;
    this.duration = duration;
    this.startTime = startTime;
    this.element = element;
    ++(runId);
    callback.execute(com.github.a2g.core.platforms.java.animation.Duration.currentTimeMillis());
}