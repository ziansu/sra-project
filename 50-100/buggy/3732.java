private void doClose(boolean cancellable) {
    java.util.Iterator<T> i;
    if ((i = iter) != null) {
        iter = null;
        if (i instanceof java.lang.AutoCloseable) {
            try {
                ((java.lang.AutoCloseable) (i)).close();
            } catch (java.lang.Exception e) {
                throw new org.apache.ignite.IgniteException(e);
            }
        }
    }else
        if (cancellable && ((cancel) != null))
            cancel.apply();
        
    
}