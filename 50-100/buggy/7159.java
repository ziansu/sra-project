@org.springframework.web.bind.annotation.CrossOrigin(origins = coursemanager.configuration.Configuration.CORS_DOMAIN)
@org.springframework.web.bind.annotation.RequestMapping(value = "/count", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.HashMap<java.lang.String, java.lang.Object> count() {
    coursemanager.services.CourseService courseService = new coursemanager.services.CourseService();
    java.lang.Integer numberOfCourses = courseService.getNumberOfCourses();
    java.util.HashMap<java.lang.String, java.lang.Object> response = new java.util.HashMap<>();
    response.put("pageSize", CourseService.PAGE_SIZE);
    response.put("numberOfCourses", numberOfCourses);
    response.put("numberOfPages", ((int) (java.lang.Math.ceil((numberOfCourses / (coursemanager.services.CourseService.PAGE_SIZE))))));
    return response;
}