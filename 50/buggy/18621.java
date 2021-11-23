@org.junit.Test
public void testAssertError() {
    java.lang.RuntimeException e = new java.lang.RuntimeException("Oops");
    rx.observers.TestSubscriber subscriber = new rx.observers.TestSubscriber();
    rx.Observable.error(e).subscribe(subscriber);
    subscriber.assertError(e);
}