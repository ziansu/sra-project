@org.springframework.web.bind.annotation.RequestMapping(value = "/session-finalize-person")
public org.springframework.web.servlet.ModelAndView finalizePerson(javax.servlet.http.HttpSession session, org.springframework.web.bind.support.SessionStatus status, @org.springframework.web.bind.annotation.ModelAttribute(value = "sessionData")
net.thewyvern.webapp.ec2.bean.Person sessionData, @org.springframework.web.bind.annotation.ModelAttribute
net.thewyvern.webapp.ec2.bean.Person person) {
    sessionData.setLastName(person.getLastName());
    sessionData.setShoeSize(person.getShoeSize());
    if ((person.isGenerateLoad()) == true) {
        net.thewyvern.webapp.ec2.load.GenerateLoad.go();
    }
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView("pages.person-result-page");
    sessionData.addHostToList(hostname());
    session.invalidate();
    status.setComplete();
    return modelAndView;
}