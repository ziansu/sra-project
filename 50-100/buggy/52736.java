@java.lang.Override
public void subscribe(final org.reactivestreams.Subscriber<? super IN> subscriber) {
    if (subscriber == null) {
        throw reactor.core.error.SpecificationExceptions.spec_2_13_exception();
    }
    final reactor.core.processor.SimpleWorkProcessor.SubscriberWorker<IN> signalProcessor = new reactor.core.processor.SimpleWorkProcessor.SubscriberWorker(this, subscriber);
    signalProcessor.subscription = new SimpleSubscription(signalProcessor, subscriber);
    reactor.core.processor.SimpleWorkProcessor.incrementSubscribers();
    this.executor.execute(new reactor.core.processor.SimpleWorkProcessor.SubscriberWorker(this, subscriber));
}