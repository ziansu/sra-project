@org.junit.Test
public void testTags() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "event", tags = { 100 , 200 })
        public void foo() {
        }
    }
    invokeMethod(Foo.class, "foo");
    int[] tags = new int[]{ 100 , 200 };
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("event").tags(100, 200).noAttributes().noSuperAttributes().noFilters();
}