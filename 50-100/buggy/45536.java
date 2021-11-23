@org.junit.Test
public void testTransformAttributeDefaultValue() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "event")
        @com.orhanobut.tracklytics.TransformAttributeMap(keys = { 0 , 1 }, values = { "value1" , "value2" })
        @com.orhanobut.tracklytics.TransformAttribute(value = "key1", defaultValue = "default1")
        public java.lang.String foo(@com.orhanobut.tracklytics.TransformAttribute(value = "key2", defaultValue = "default2")
        java.lang.Integer val) {
            return null;
        }
    }
    org.mockito.Mockito.when(joinPoint.getArgs()).thenReturn(new java.lang.Object[]{ null });
    invokeMethod(Foo.class, "foo", java.lang.Integer.class);
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("event").noTags().attribute("key1", "default1").attribute("key2", "default2").noSuperAttributes().noFilters();
}