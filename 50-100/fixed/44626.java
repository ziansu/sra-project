@org.springframework.web.bind.annotation.RequestMapping(value = "/addLecture", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView addLecture(java.security.Principal principal) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("addLecture");
    model.addObject("lectureForm", new ch.unibe.ese.controller.pojos.LectureForm());
    model.addObject("user", studentSearchService.getStudentByUsername(principal.getName()));
    return model;
}