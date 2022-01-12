@java.lang.Override
public final void onResponse(V response) {
    try {
        com.hazelcast.simulator.worker.tasks.AbstractAsyncWorker.increaseIteration();
    } finally {
        handleResponse(response);
    }
}