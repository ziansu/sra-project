@org.junit.Test
public void testStart() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.Tracklytics(value = TrackerAction.START)
        com.orhanobut.tracklytics.Tracker start() {
            return new com.orhanobut.tracklytics.Tracker.Default();
        }
    }
    initMethod(Foo.class, "start");
    aspect.weaveJointTracklytics(joinPoint);
    org.mockito.Mockito.verify(tracker).start();
}