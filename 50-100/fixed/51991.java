@java.lang.Override
public void lock() {
    this.delegate.lock();
    while (true) {
        try {
            while (!(doLock())) {
                java.lang.Thread.sleep(100);
            } 
            break;
        } catch (org.springframework.transaction.TransactionTimedOutException e) {
        } catch (java.lang.InterruptedException e) {
        } catch (java.lang.Exception e) {
            this.delegate.unlock();
            rethrowAsLockException(e);
        }
    } 
}