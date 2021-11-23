@java.lang.Override
public final void run() {
    try {
        process(metadataStreamQueue.poll(5, java.util.concurrent.TimeUnit.SECONDS));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    while (!(metadataStreamQueue.isEmpty())) {
        try {
            process(metadataStreamQueue.poll(2, java.util.concurrent.TimeUnit.SECONDS));
        } catch (java.lang.Exception e) {
            com.petpet.c3po.api.adaptor.AbstractAdaptor.LOG.error("Adaptor stopped unexpectedly {}", java.lang.Thread.currentThread().getName());
            e.printStackTrace();
        }
    } 
}