public <T> void retryCons(final kbasesearchengine.events.exceptions.RetryConsumer<T> consumer, final T input, final kbasesearchengine.events.ObjectStatusEvent event) throws java.lang.InterruptedException, kbasesearchengine.events.exceptions.IndexingException {
    int retries = 1;
    int fatalRetries = 1;
    while (true) {
        try {
            consumer.accept(input);
        } catch (kbasesearchengine.events.exceptions.RetriableIndexingException e) {
            final boolean fatal = handleException(event, e, retries, fatalRetries);
            if (fatal) {
                fatalRetries++;
            }else {
                retries++;
            }
        }
    } 
}