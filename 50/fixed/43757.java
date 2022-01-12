public boolean isBasic(final org.fenixedu.academic.domain.ExecutionSemester period) {
    final org.fenixedu.academic.domain.degreeStructure.CompetenceCourseInformation information = findCompetenceCourseInformationForExecutionPeriod(period);
    return information != null ? information.getBasic() : false;
}