public synchronized void applyTo(act.app.App app) {
    for (act.plugin.AppServicePlugin plugin : registry.values()) {
        plugin.applyTo(app);
    }
}