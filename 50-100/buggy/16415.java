@java.lang.Override
public <OutputT> OutputT runApplication(dk.alexandra.fresco.framework.Application<OutputT, Builder> application, ResourcePoolT sceNetwork) {
    java.util.concurrent.Future<OutputT> future = startApplication(application, sceNetwork);
    try {
        return future.get(10, java.util.concurrent.TimeUnit.MINUTES);
    } catch (java.lang.InterruptedException | java.util.concurrent.TimeoutException e) {
        throw new java.lang.RuntimeException("Internal error in waiting", e);
    } catch (java.util.concurrent.ExecutionException e) {
        throw new java.lang.RuntimeException("Execution exception when running the application", e.getCause());
    }
}