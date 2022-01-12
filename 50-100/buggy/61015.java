public void onParseComplete(org.digitalcampus.oppia.utils.xmlreaders.CourseXMLReader parsed) {
    cxr = parsed;
    course.setMetaPages(cxr.getMetaPages());
    sections = cxr.getSections();
    boolean baselineCompleted = isBaselineCompleted();
    if (!baselineCompleted) {
        showBaselineMessage();
    }
    initializeCourseIndex(true);
    invalidateOptionsMenu();
}