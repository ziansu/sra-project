@java.lang.Override
public void obtainTreeLock(long timeout) {
    if (timeout < 1) {
        m_lock.lock();
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