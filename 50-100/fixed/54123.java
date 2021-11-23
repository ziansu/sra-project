@org.junit.Test
public void trackEventWithoutAttributes() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "title")
        public void foo() {
        }
    }
    invokeMethod(Foo.class, "foo");
    org.mockito.ArgumentCaptor<java.util.Map> argument = org.mockito.ArgumentCaptor.forClass(java.util.Map.class);
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("title").noTags().noAttributes().noSuperAttributes();
}