@com.finalproject.courseevaluation_studentattendance.Controller.PostMapping(value = "/searchcourse")
public java.lang.String searchCoursePost(@com.finalproject.courseevaluation_studentattendance.Controller.RequestParam(value = "crnfield")
java.lang.Long crn, org.springframework.ui.Model model) {
    if (crn == null) {
        return "evalpages/searchcourse";
    }
    model.addAttribute("searcheval", courseRepository.findAllByCrn(crn));
    return "evalpages/searchcourse";
}