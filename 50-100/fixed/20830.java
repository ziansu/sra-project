@java.lang.Override
public boolean constrained(T t, long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    if (constrained()) {
        if (!(constrained.offer(t, time, unit))) {
            throw new java.util.concurrent.TimeoutException();
        }
        return true;
    }else {
        return false;
    }
}