@java.lang.Override
public E get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    synchronized(this) {
        while (com.hazelcast.simulator.agent.CommandFuture.NO_RESULT.equals(result)) {
            wait();
        } 
        if ((result) instanceof java.lang.Throwable) {
            throw new java.util.concurrent.ExecutionException(((java.lang.Throwable) (result)));
        }
        return result;
    }
}