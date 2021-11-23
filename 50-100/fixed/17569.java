@org.junit.Test
public void testTransformAttributeForParameters() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "event")
        @com.orhanobut.tracklytics.TransformAttributeMap(keys = { 0 , 1 }, values = { "value1" , "value2" })
        public void foo(@com.orhanobut.tracklytics.TransformAttribute(value = "key1")
        java.lang.Integer type) {
        }
    }
    org.mockito.Mockito.when(joinPoint.getArgs()).thenReturn(new java.lang.Object[]{ 0 });
    invokeMethod(Foo.class, "foo", java.lang.Integer.class);
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("event").noTags().attribute("key1", "value1").noSuperAttributes();
}