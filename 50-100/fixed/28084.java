@org.junit.Test
public void testDisabledFilterDoesNotAffectOfFlow() throws java.lang.Exception {
    io.reactivex.observers.TestObserver<com.github.e13mort.stf.model.device.Device> testObserver = io.reactivex.Observable.fromArray(getMock(true, true, false), getMock(true, false, false), getMock(false, true, false), getMock(false, false, false)).filter(new com.github.e13mort.stf.adapter.filters.AvailabilityPredicate(false)).test();
    testObserver.assertValueCount(4);
}