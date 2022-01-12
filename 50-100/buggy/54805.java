@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public cn.momia.common.api.http.MomiaHttpResponse get(@org.springframework.web.bind.annotation.RequestParam
long id) {
    cn.momia.api.course.dto.SubjectDto subject = processSubject(subjectServiceApi.get(id));
    cn.momia.common.api.dto.PagedList<cn.momia.api.course.dto.CourseDto> courses = processPagedCourses(courseServiceApi.listBySubject(id, 0, 2));
    com.alibaba.fastjson.JSONObject responseJson = new com.alibaba.fastjson.JSONObject();
    responseJson.put("subject", subject);
    responseJson.put("courses", courses);
    return cn.momia.common.api.http.MomiaHttpResponse.SUCCESS(responseJson);
}