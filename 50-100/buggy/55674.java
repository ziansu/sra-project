@com.advisorapp.api.controller.RequestMapping(value = "/{id}/semesters", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
@com.advisorapp.api.controller.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
@com.wordnik.swagger.annotations.ApiOperation(value = "Create a semester for a SP.", notes = "Returns the URL of the new resource in the Location header.")
public com.advisorapp.api.model.Semester createSemesterForSP(@com.wordnik.swagger.annotations.ApiParam(value = "The ID of the SP.", required = true)
@com.advisorapp.api.controller.PathVariable(value = "id")
java.lang.Long id, @com.advisorapp.api.controller.RequestBody
com.advisorapp.api.model.Semester semester, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    com.advisorapp.api.model.StudyPlan attachedSP = this.studyPlanService.getStudyPlan(id);
    checkResourceFound(attachedSP);
    int semesterNumber = (attachedSP.getSemesters().size()) + 1;
    semester.setStudyPlan(attachedSP);
    semester.setNumber(semesterNumber);
    com.advisorapp.api.model.Semester createdSemester = this.semesterService.createSemester(semester);
    return createdSemester;
}