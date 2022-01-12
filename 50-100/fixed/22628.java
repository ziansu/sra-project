@org.junit.Test
public void testFixedAttributeAndAttributeAtSameTime() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "title")
        @com.orhanobut.tracklytics.Attribute(value = "key1")
        @com.orhanobut.tracklytics.FixedAttribute(key = "key2", value = "value2")
        public java.lang.String foo() {
            return "value1";
        }
    }
    org.mockito.Mockito.when(joinPoint.proceed()).thenReturn("value1");
    invokeMethod(Foo.class, "foo");
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("title").noTags().attribute("key1", "value1").attribute("key2", "value2").noSuperAttributes();
}