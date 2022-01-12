@org.junit.Test
public void ignoreNullValueOnTrackableAttributeForCurrentClass() throws java.lang.Throwable {
    class Foo implements com.orhanobut.tracklytics.Trackable {
        @java.lang.Override
        public java.util.Map<java.lang.String, java.lang.String> getTrackableAttributes() {
            return null;
        }

        @com.orhanobut.tracklytics.TrackEvent(value = "event")
        @com.orhanobut.tracklytics.TrackableAttribute
        public void foo() {
        }
    }
    initMethod(Foo.class, "foo");
    org.mockito.Mockito.when(joinPoint.getThis()).thenReturn(new Foo());
    aspect.weaveJoinPointTrackEvent(joinPoint);
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("event").noTags().noAttributes().noSuperAttributes().noFilters();
}