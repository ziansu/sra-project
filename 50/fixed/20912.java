@java.lang.SuppressWarnings(value = "unchecked")
private static void assertSingleValue(rx.observers.TestSubscriber sub, java.lang.Object value) {
    sub.assertCompleted();
    sub.assertUnsubscribed();
    sub.assertValue(value);
}