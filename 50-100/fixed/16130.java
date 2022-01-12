protected final <T> T withTreeLock(java.util.concurrent.Callable<T> c) {
    try {
        obtainTreeLock();
        return c.call();
    } catch (java.lang.RuntimeException e) {
        throw e;
    } catch (java.lang.Throwable e) {
        throw new java.lang.RuntimeException(e);
    } finally {
        releaseTreeLock();
    }
}