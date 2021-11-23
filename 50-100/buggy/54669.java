@org.springframework.web.bind.annotation.RequestMapping(value = "/enrollments")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<MyPlanner.controller.Enrollment> getEnrollment(javax.servlet.http.HttpServletRequest request) throws MyPlanner.exceptions.NotAuthorizedException {
    MyPlanner.controller.LoginInfo loginInfo = ((MyPlanner.controller.LoginInfo) (request.getSession().getAttribute("loginInfo")));
    loginInfo.getUser().setId(320);
    java.util.List<MyPlanner.controller.Enrollment> enrollmentList = canvasApi.getEnrollment(loginInfo.getUser(), loginInfo.getAccessToken());
    return enrollmentList;
}