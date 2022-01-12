@java.lang.Override
protected void obtainTreeLock(long timeout) throws org.opennms.netmgt.poller.pollables.LockUnavailable {
    if (timeout < 1) {
        obtainTreeLock();
    }else {
        try {
            if (m_lock.tryLock(timeout, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return ;
            }else {
                throw new org.opennms.netmgt.poller.pollables.LockUnavailable((((("Unable to obtain lock for " + (this)) + " within ") + timeout) + " milliseconds"));
            }
        } catch (java.lang.InterruptedException e) {
            throw new org.opennms.netmgt.poller.pollables.LockUnavailable(((("Interrupted while waiting " + timeout) + " milliseconds to obtain lock for ") + (this)));
        }
    }
}