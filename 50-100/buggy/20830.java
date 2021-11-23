@java.lang.Override
public boolean constrained(T t, long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    if (constrained()) {
        return false;
    }else {
        if (!(constrained.offer(t, time, unit))) {
            throw new java.util.concurrent.TimeoutException();
        }
        return true;
    }
}