@java.lang.Override
public void run() {
    try {
        while ((totalConsumed.get()) < (NUM_MESSAGES)) {
            my.cool.Message message = consumer.receive();
            counter.incrementAndGet();
        } 
    } catch (java.lang.Exception e) {
        my.cool.PriorityAndPrefetch.log.error("Caught an unexpected error: ", e);
    }
}