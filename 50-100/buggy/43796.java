protected void offer(java.util.Collection<E> out) {
    try {
        boolean putSuccessful = false;
        while (!putSuccessful) {
            putSuccessful = queue.offer(out, 10, java.util.concurrent.TimeUnit.SECONDS);
            if (!putSuccessful) {
                java.lang.System.gc();
            }
        } 
        if (consumerGone)
            throw new uk.me.mjt.osmpbf.planetproc.AbstractReader.ConsumerGoneRuntimeException();
        
        queue.put(out);
    } catch (java.lang.InterruptedException e) {
        if (consumerGone) {
            throw new uk.me.mjt.osmpbf.planetproc.AbstractReader.ConsumerGoneRuntimeException();
        }else {
            throw new java.lang.RuntimeException(e);
        }
    }
}