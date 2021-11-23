@org.junit.Test
public void useReturnValueAsAttribute() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "title")
        @com.orhanobut.tracklytics.Attribute(value = "key")
        public java.lang.String foo() {
            return "test";
        }
    }
    org.mockito.Mockito.when(joinPoint.proceed()).thenReturn("test");
    invokeMethod(Foo.class, "foo");
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("title").noTags().attribute("key", "test").noSuperAttributes();
}