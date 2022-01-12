@java.lang.Override
public void run() {
    while (!(cascading.util.ShutdownUtil.queue.isEmpty())) {
        cascading.util.ShutdownUtil.Hook hook = null;
        try {
            hook = cascading.util.ShutdownUtil.queue.poll();
            hook.execute();
        } catch (java.lang.Exception exception) {
            cascading.util.ShutdownUtil.LOG.error("failed executing hook: {}, with exception: {}", hook, exception);
        }
    } 
}