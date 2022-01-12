@java.lang.Override
public com.segment.analytics.Properties trackCourseComponentViewed(java.lang.String blockId, java.lang.String courseId, boolean isPortrait) {
    org.edx.mobile.module.analytics.ISegmentImpl.SegmentAnalyticsEvent aEvent = new org.edx.mobile.module.analytics.ISegmentImpl.SegmentAnalyticsEvent();
    aEvent.properties.putValue(Keys.NAME, Values.COMPONENT_VIEWED);
    aEvent.data.putValue(Keys.BLOCK_ID, blockId);
    aEvent.data.putValue(Keys.COURSE_ID, courseId);
    aEvent.data.putValue(Keys.ORIENTATION, (isPortrait ? Values.PORTRAIT : Values.LANDSCAPE));
    aEvent.setAppNameContext();
    aEvent.properties = addCategoryToBiEvents(aEvent.properties, Values.NAVIGATION, Keys.COMPONENT_VIEWED);
    tracker.track(Keys.COMPONENT_VIEWED, aEvent.properties);
    return aEvent.properties;
}