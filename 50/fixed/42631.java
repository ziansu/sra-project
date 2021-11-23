public void start() {
    if (!(this.started.get())) {
        started.set(true);
        mixCount.set(0);
        scheduler.submit(mixer, PriorityQueueScheduler.MIXER_MIX_QUEUE);
    }
}