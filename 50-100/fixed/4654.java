@java.lang.Override
protected void doStart() throws java.lang.Exception {
    org.orienteer.camel.tasks.CamelEventHandler.LOG.info(java.lang.Thread.currentThread().getName());
    taskSession = new org.orienteer.camel.tasks.OCamelTaskSession();
    taskSession.setCallback(callback);
    taskSession.setDeleteOnFinish(false);
    taskSession.setConfig(configId);
    taskSession.setFinalProgress(context.getRoutes().size());
    taskSession.start();
    super.doStart();
}