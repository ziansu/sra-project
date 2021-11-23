@org.springframework.web.bind.annotation.RequestMapping(value = "/course/{year}/{code}/{assId}")
public java.lang.String assessmentPageHandler(@org.springframework.web.bind.annotation.PathVariable
java.lang.String year, @org.springframework.web.bind.annotation.PathVariable
java.lang.String code, @org.springframework.web.bind.annotation.PathVariable
java.lang.String assId, org.springframework.ui.Model model) {
    stumasys.Course course = db.getCourse(code, year);
    if (course == null) {
        return "404";
    }
    stumasys.Assessment assessment = c.getAssessment(assId);
    if (assessment == null) {
        return "404";
    }
    return "assessment";
}