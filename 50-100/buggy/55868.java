@org.junit.Test
public void useDefaultValueWhenThereIsNoReturnValue() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "title")
        @com.orhanobut.tracklytics.Attribute(value = "key1", defaultValue = "defaultValue")
        public void foo() {
        }
    }
    invokeMethod(Foo.class, "foo");
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("title").noTags().attribute("key1", "defaultValue").noSuperAttributes().noFilters();
}