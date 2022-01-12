public void start() {
    if ((threadUpdater) == null) {
        threadUpdater = new java.util.Timer(("Thread - " + (this.name)));
        threadUpdater.schedule(new ca.team4519.lib.Threader.UpdaterTask(this), (((long) (this.period)) * 1000));
    }
}