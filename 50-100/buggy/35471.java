public java.lang.Void call() {
    if ((!(future.isDone())) && (!(future.isCancelled()))) {
        java.lang.System.out.println(java.lang.String.format((("[" + (new java.util.Date())) + "] - Cancelled the task '%s' since it's timeout in %d miniutes."), task.getId(), build.getEmulatorTimeout()));
        future.cancel(true);
    }
    return null;
}