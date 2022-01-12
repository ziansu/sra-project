@org.springframework.web.bind.annotation.RequestMapping(value = "/addLecture", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView addLecture(java.security.Principal principal) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("addLecture");
    ch.unibe.ese.model.Student user = studentSearchService.getStudentByUsername(principal.getName());
    model.addObject("lectureForm", new ch.unibe.ese.controller.pojos.LectureForm());
    model.addObject("user", user);
    return model;
}