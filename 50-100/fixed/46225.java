@org.junit.Ignore(value = "It doesn't work on CI, need to find the reason")
@org.junit.Test
public void testScreenNameAttribute() throws java.lang.Throwable {
    @com.orhanobut.tracklytics.ScreenNameAttribute(key = "name", excludeLast = 2, delimiter = "-")
    class BasePresenter {
        @com.orhanobut.tracklytics.TrackEvent(value = "event")
        public void base() {
        }
    }
    class FooBarBasePresenter extends BasePresenter {    }
    initMethod(FooBarBasePresenter.class, "base");
    org.mockito.Mockito.when(joinPoint.getThis()).thenReturn(new FooBarBasePresenter());
    aspect.weaveJoinPointTrackEvent(joinPoint);
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("event").noTags().attribute("name", "Foo-Bar").noSuperAttributes();
}