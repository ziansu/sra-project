public com.advisorapp.api.model.Semester setStudyPlan(com.advisorapp.api.model.StudyPlan studyPlan) {
    this.studyPlan = studyPlan;
    this.setNumber(((studyPlan.getSemesters().size()) + 1));
    studyPlan.addSemester(this);
    return this;
}