@java.lang.Override
public void close() {
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
        if ((cancel) != null)
            cancel.apply();
        
    
}