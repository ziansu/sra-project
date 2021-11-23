@org.junit.Test
public void testFixedAttributeOnMethodScope() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "title")
        @com.orhanobut.tracklytics.FixedAttribute(key = "key1", value = "value")
        public java.lang.String foo() {
            return "returnValue";
        }
    }
    invokeMethod(Foo.class, "foo");
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("title").noTags().attribute("key1", "value").noSuperAttributes().noFilters();
}