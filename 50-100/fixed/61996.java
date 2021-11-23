@org.junit.Test
public void testReactCalls() {
    int reactCalls = (_random.nextInt(1000)) + 1;
    for (int i = 0; i < reactCalls; i++) {
        _observable.notifyObservers();
    }
    for (de.uni_hamburg.informatik.swt.se2.kino.observer.CountingObserver observer : _observers) {
        org.junit.Assert.assertEquals(observer.getCallCount(), reactCalls);
    }
}