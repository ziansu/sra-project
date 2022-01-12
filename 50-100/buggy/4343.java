public java.lang.String getLocalizedEvaluationMethodText() {
    final net.sourceforge.fenixedu.domain.EvaluationMethod evaluationMethod = getEvaluationMethod();
    if (evaluationMethod != null) {
        final pt.utl.ist.fenix.tools.util.i18n.MultiLanguageString evaluationElements = evaluationMethod.getEvaluationElements();
        return evaluationElements.getContent();
    }
    for (final net.sourceforge.fenixedu.domain.CompetenceCourse competenceCourse : getCompetenceCourses()) {
        final org.fenixedu.commons.i18n.LocalizedString lstring = competenceCourse.getLocalizedEvaluationMethod(getExecutionPeriod());
        final java.lang.String competenceEvaluationMethod = lstring.getContent();
        if (competenceEvaluationMethod != null) {
            return competenceEvaluationMethod;
        }
    }
    return "";
}