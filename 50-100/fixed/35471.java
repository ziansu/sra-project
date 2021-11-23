public java.lang.Void call() {
    if (future.cancel(true)) {
        java.lang.System.out.println(java.lang.String.format((("[" + (new java.util.Date())) + "] - Cancelled the task '%s' since it's timeout in %d miniutes."), task.getId(), build.getEmulatorTimeout()));
    }
    return null;
}