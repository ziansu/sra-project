public void send(java.lang.String msg) throws java.io.IOException {
    if (((session) != null) && (session.isOpen())) {
        session.getBasicRemote().sendText(msg);
    }else {
        java.util.concurrent.ScheduledExecutorService exec = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        exec.schedule(new io.wonderfuel.fueldb.api.core.ResendTask(this, msg), 5, java.util.concurrent.TimeUnit.SECONDS);
    }
}