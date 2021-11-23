@org.springframework.web.bind.annotation.RequestMapping(value = "regCandidateNew", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void doAutoLogin(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.ModelAttribute(value = "infoForm")
ua.com.jobsukraine.entity.LoginInfo info, @org.springframework.web.bind.annotation.ModelAttribute(value = "candidate")
ua.com.jobsukraine.entity.Candidate candidate) throws java.io.IOException {
    java.lang.String password = info.getPassword();
    securityService.encodePassword(info);
    candidateService.register(candidate, info);
    securityService.autoLoginAfterRegistration(request, response, candidate.getInfo().getLogin(), password);
}