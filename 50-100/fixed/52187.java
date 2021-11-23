@org.junit.Test
public void useDefaultValueWhenParameterValueIsNull() throws java.lang.Throwable {
    class Foo {
        @com.orhanobut.tracklytics.TrackEvent(value = "title")
        public void foo(@com.orhanobut.tracklytics.Attribute(value = "key1", defaultValue = "default")
        java.lang.String val) {
        }
    }
    org.mockito.Mockito.when(joinPoint.getArgs()).thenReturn(new java.lang.Object[]{ null });
    invokeMethod(Foo.class, "foo", java.lang.String.class);
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("title").noTags().attribute("key1", "default").noSuperAttributes();
}