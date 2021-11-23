@java.lang.Override
public void run() {
    try {
        while (!(testContext.isStopped())) {
            timeStep();
        } 
    } catch (java.lang.RuntimeException e) {
        throw e;
    } catch (java.lang.Exception e) {
        throw new com.hazelcast.simulator.test.TestException(e);
    }
}