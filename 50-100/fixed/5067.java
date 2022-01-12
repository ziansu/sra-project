@org.junit.Test
public void overrideClassWideAttributeOnMethodWhenAttributesAreSame() throws java.lang.Throwable {
    @com.orhanobut.tracklytics.FixedAttribute(key = "key", value = "class")
    @com.orhanobut.tracklytics.FixedAttributes(value = @com.orhanobut.tracklytics.FixedAttribute(key = "key1", value = "class1"))
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "event")
        @com.orhanobut.tracklytics.FixedAttribute(key = "key", value = "method")
        @com.orhanobut.tracklytics.FixedAttributes(value = @com.orhanobut.tracklytics.FixedAttribute(key = "key1", value = "method1"))
        public void foo() {
        }
    }
    invokeMethod(Foo.class, "foo");
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("event").noTags().attribute("key", "method").attribute("key1", "method1").noSuperAttributes();
}