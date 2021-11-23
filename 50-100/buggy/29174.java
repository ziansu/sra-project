@java.lang.Override
public org.fenixedu.academic.domain.curricularRules.executors.RuleResult executeEnrolmentVerificationWithRules(final org.fenixedu.academic.domain.curricularRules.ICurricularRule curricularRule, final org.fenixedu.academic.domain.enrolment.IDegreeModuleToEvaluate sourceDegreeModuleToEvaluate, final org.fenixedu.academic.domain.enrolment.EnrolmentContext enrolmentContext) {
    org.fenixedu.academic.domain.curricularRules.executors.RuleResult result = createFalseConfiguration(sourceDegreeModuleToEvaluate.getDegreeModule());
    final org.fenixedu.academic.domain.CurricularCourse curricularCourseToEnrol = org.fenixedu.academic.domain.curricularRules.executors.ruleExecutors.AnyCurricularCourseExceptionsExecutorLogic.getCurricularCourseFromOptional(sourceDegreeModuleToEvaluate);
    if (curricularCourseToEnrol != null) {
        result = verifyOptionalsConfiguration(((org.fenixedu.academic.domain.curricularRules.AnyCurricularCourseExceptions) (curricularRule)), sourceDegreeModuleToEvaluate, curricularCourseToEnrol);
        if (result.isTrue()) {
            result = verifyCompetenceCourses(((org.fenixedu.academic.domain.curricularRules.AnyCurricularCourseExceptions) (curricularRule)), sourceDegreeModuleToEvaluate, curricularCourseToEnrol);
        }
    }
    return result;
}