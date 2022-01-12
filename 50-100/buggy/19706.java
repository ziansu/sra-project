@net.github.rtc.app.controller.admin.RequestMapping(value = "/update", method = RequestMethod.POST)
public java.lang.String update(@net.github.rtc.app.controller.admin.ModelAttribute(value = net.github.rtc.app.controller.admin.CoursesController.COURSE)
final net.github.rtc.app.model.entity.course.Course course, @net.github.rtc.app.controller.admin.RequestParam(required = false)
final boolean published, @net.github.rtc.app.controller.admin.RequestParam(required = false)
final boolean newsCreated) {
    courseService.update(published, published, course);
    return ((((net.github.rtc.app.controller.admin.CoursesController.REDIRECT) + (net.github.rtc.app.controller.admin.CoursesController.VIEW)) + (course.getCode())) + (net.github.rtc.app.controller.admin.CoursesController.NEWS_CREATED)) + newsCreated;
}