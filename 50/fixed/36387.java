@pt.ist.fenixframework.Atomic
protected org.fenixedu.ulisboa.specifications.domain.student.importation.DgesStudentImportationProcess launchImportation(final org.fenixedu.academic.domain.ExecutionYear executionYear, org.fenixedu.spaces.domain.Space space, final org.fenixedu.academic.domain.EntryPhase phase, org.fenixedu.ulisboa.specifications.domain.student.importation.DgesStudentImportationFile file) {
    return new org.fenixedu.ulisboa.specifications.domain.student.importation.DgesStudentImportationProcess(executionYear, space, phase, file);
}