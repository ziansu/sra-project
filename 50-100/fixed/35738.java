@java.lang.Override
public void run() {
    try {
        while (!(testContext.isStopped())) {
            timeStep();
        } 
    } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) (e));
        }
        throw new com.hazelcast.simulator.test.TestException(e);
    }
}