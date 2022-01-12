@java.lang.Override
protected org.fenixedu.academic.domain.student.curriculum.Curriculum getCurriculum(final org.fenixedu.academic.domain.studentCurriculum.Dismissal dismissal, final org.joda.time.DateTime when, final org.fenixedu.academic.domain.ExecutionYear year) {
    final java.util.Collection<org.fenixedu.academic.domain.student.curriculum.ICurriculumEntry> averageEntries = getAverageEntries(dismissal, year);
    return averageEntries.isEmpty() ? org.fenixedu.academic.domain.student.curriculum.Curriculum.createEmpty(dismissal, year) : super.getCurriculum(dismissal, when, year);
}