@org.springframework.web.bind.annotation.RequestMapping(value = "regEmployerNew", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void doAutoLogin(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.ModelAttribute(value = "empForm")
ua.com.jobsukraine.entity.Employer emp, @org.springframework.web.bind.annotation.ModelAttribute(value = "infoForm")
ua.com.jobsukraine.entity.LoginInfo info) throws java.io.IOException {
    java.lang.String password = info.getPassword();
    ss.encodePassword(info);
    employerService.register(emp, info);
    ss.autoLoginAfterRegistration(request, response, info.getLogin(), password);
}