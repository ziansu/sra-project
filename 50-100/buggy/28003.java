@org.springframework.web.bind.annotation.RequestMapping(value = "/{coid}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public cn.momia.common.api.http.MomiaHttpResponse get(@org.springframework.web.bind.annotation.PathVariable(value = "coid")
long courseId, @org.springframework.web.bind.annotation.RequestParam
java.lang.String pos, @org.springframework.web.bind.annotation.RequestParam(required = false, defaultValue = "" + (Course.ShowType.BASE))
int type) {
    cn.momia.service.course.base.Course course = courseService.get(courseId);
    if ((!(course.exists())) || ((course.getStatus()) != 1))
        return cn.momia.common.api.http.MomiaHttpResponse.FAILED("课程不存在");
    
    return cn.momia.common.api.http.MomiaHttpResponse.SUCCESS((type == (Course.ShowType.FULL) ? buildFullCourseDto(course, pos) : buildBaseCourseDto(course)));
}