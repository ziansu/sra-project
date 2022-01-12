@java.lang.Override
public java.lang.Void get() throws org.pcj.PcjRuntimeException {
    synchronized(lock) {
        while ((done) == false) {
            try {
                lock.wait();
            } catch (java.lang.InterruptedException ex) {
                throw new org.pcj.PcjRuntimeException(ex);
            }
        } 
    }
    return null;
}