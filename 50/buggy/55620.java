@java.lang.Override
public void call(rx.Subscriber<? super java.lang.Integer> subscriber) {
    try {
        subscriber.onNext(requestFailure(c));
        subscriber.onCompleted();
    } catch (java.lang.InterruptedException e) {
        org.junit.Assert.fail();
    }
}