@org.springframework.web.bind.annotation.RequestMapping(value = "/addTimeframe", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView addLecture(java.security.Principal principal) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("addTimeframe");
    model.addObject("timeframeForm", new ch.unibe.ese.controller.pojos.TimeframeForm());
    model.addObject("user", studentSearchService.getStudentByUsername(principal.getName()));
    return model;
}