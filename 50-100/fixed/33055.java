@org.junit.Test
public void testStop() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.Tracklytics(value = TrackerAction.STOP)
        com.orhanobut.tracklytics.Tracker stop() {
            return new com.orhanobut.tracklytics.Tracker.Default();
        }
    }
    initMethod(Foo.class, "stop");
    com.orhanobut.tracklytics.Tracker tracker = ((com.orhanobut.tracklytics.Tracker) (aspect.weaveJointTracklytics(joinPoint)));
    org.mockito.Mockito.verify(tracker).stop();
}