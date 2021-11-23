@com.example.demo.controllers.RequestMapping(value = "/mycoursesdetail")
public java.lang.String listTeacherCourses(java.security.Principal principal, org.springframework.ui.Model model) {
    com.example.demo.models.Person teacher = personRepo.findByUsername(principal.getName());
    model.addAttribute("teachercourse", teacher);
    model.addAttribute("courselist", courseRepo.findByPersons(teacher));
    return "teachercoursedetail";
}