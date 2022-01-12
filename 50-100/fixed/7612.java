private synchronized void await(org.opendaylight.vtn.manager.it.ofmock.impl.FlowTable.TableCond cond, long timeout) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    if (!(cond.check())) {
        long msec = timeout;
        long deadline = (java.lang.System.currentTimeMillis()) + timeout;
        do {
            wait(msec);
            if (cond.check()) {
                return ;
            }
            msec = deadline - (java.lang.System.currentTimeMillis());
        } while (msec > 0 );
        throw new java.util.concurrent.TimeoutException(cond.getTimeoutError());
    }
}