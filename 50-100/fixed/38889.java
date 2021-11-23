private synchronized void startTask(final java.lang.String url) {
    if ((task) != null) {
        task.cancel();
    }
    if ((promptInterval) > 0) {
        task = new com.truckmovers.cordova.RemoteInjectionPlugin.UserPromptTask(this, activity, engine, url);
        new java.util.Timer().schedule(task, ((promptInterval) * 1000));
    }
}