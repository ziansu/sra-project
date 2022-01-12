private java.lang.String getCourseDescription(final net.github.rtc.app.model.course.Course course) {
    final java.util.Map<java.lang.String, java.lang.Object> templateMap = new java.util.HashMap<>();
    templateMap.put("termInMonth", dateService.getMothPeriod(course.getStartDate(), course.getEndDate()));
    final java.lang.String templatePath = getCourseDescriptionTemplatePath(course);
    if (templatePath.equals(net.github.rtc.app.utils.CourseNewsCreator.DEV_COURSE_TEMPLATE)) {
        templateMap.put("tags", course.getTags());
    }
    return getStringFromTemplate(templatePath, templateMap);
}