public <T> T withTreeLock(java.util.concurrent.Callable<T> c, long timeout) {
    try {
        obtainTreeLock(timeout);
        return c.call();
    } catch (java.lang.RuntimeException e) {
        throw e;
    } catch (java.lang.Throwable e) {
        throw new java.lang.RuntimeException(e);
    } finally {
        releaseTreeLock();
    }
}