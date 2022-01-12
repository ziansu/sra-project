@org.junit.Test
public void createObservableSuccess() {
    rx.observers.TestSubscriber<io.techery.janet.model.TestAction> subscriber = new rx.observers.TestSubscriber<io.techery.janet.model.TestAction>();
    io.techery.janet.model.TestAction action = new io.techery.janet.model.TestAction();
    actionPipe.createObservableSuccess(action).subscribe(subscriber);
    subscriber.unsubscribe();
    io.techery.janet.AssertUtil.assertSubscriberWithSingleValue(subscriber);
    subscriber.assertValue(action);
}