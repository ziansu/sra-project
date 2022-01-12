@org.junit.Test
public void testStop() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.Tracklytics(value = TrackerAction.STOP)
        com.orhanobut.tracklytics.Tracker stop() {
            return new com.orhanobut.tracklytics.Tracker.Default();
        }
    }
    initMethod(Foo.class, "stop");
    aspect.weaveJointTracklytics(joinPoint);
    org.mockito.Mockito.verify(tracker).stop();
}