@org.junit.Test
public void subclassClassAttributeShouldOverrideScreenNameAttribute() throws java.lang.Throwable {
    @com.orhanobut.tracklytics.ScreenNameAttribute(key = "key", excludeLast = 2, delimiter = "-")
    class BasePresenter {
        @com.orhanobut.tracklytics.TrackEvent(value = "event")
        public void base() {
        }
    }
    @com.orhanobut.tracklytics.FixedAttribute(key = "key", value = "value1")
    class FooBarBasePresenter extends BasePresenter {    }
    initMethod(FooBarBasePresenter.class, "base");
    org.mockito.Mockito.when(joinPoint.getThis()).thenReturn(new FooBarBasePresenter());
    aspect.weaveJoinPointTrackEvent(joinPoint);
    com.orhanobut.tracklytics.AssertTracker.assertTrack(tracker).event("event").noTags().attribute("key", "value1").noSuperAttributes().noFilters();
}