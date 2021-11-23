@org.junit.Test
public void testAssertError() {
    java.lang.RuntimeException e = new java.lang.RuntimeException("Oops");
    rx.observers.TestSubscriber<java.lang.Object> subscriber = new rx.observers.TestSubscriber<java.lang.Object>();
    rx.Observable.error(e).subscribe(subscriber);
    subscriber.assertError(e);
}