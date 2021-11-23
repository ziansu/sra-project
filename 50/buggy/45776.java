public synchronized void applyTo(act.app.App app) {
    for (act.plugin.AppServicePlugin plugin : registry) {
        plugin.applyTo(app);
    }
}