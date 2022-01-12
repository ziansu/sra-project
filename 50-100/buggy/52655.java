@org.junit.Test
public void testTransformAttributeForReturnValue() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "event")
        @com.orhanobut.tracklytics.TransformAttributeMap(keys = { 0 , 1 }, values = { "value1" , "value2" })
        @com.orhanobut.tracklytics.TransformAttribute(value = "key1")
        public int foo() {
            return 1;
        }
    }
    org.mockito.Mockito.when(joinPoint.proceed()).thenReturn(1);
    invokeMethod(Foo.class, "foo");
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("event").noTags().attribute("key1", "value2").noSuperAttributes().noFilters();
}