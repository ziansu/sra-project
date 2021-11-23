@com.finalproject.courseevaluation_studentattendance.Controller.PostMapping(value = "/searchcourse")
public java.lang.String searchCoursePost(@javax.validation.Valid
@com.finalproject.courseevaluation_studentattendance.Controller.RequestParam(value = "crnfield")
long crn, com.finalproject.courseevaluation_studentattendance.Model.Course course, org.springframework.validation.BindingResult bindingResult, org.springframework.ui.Model model) {
    if (bindingResult.hasErrors()) {
        return "evalpages/evaluationentry";
    }
    model.addAttribute("searcheval", courseRepository.findAllByCrn(crn));
    return "evalpages/searchcourse";
}