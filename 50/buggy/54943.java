public void checkRulesToDelete() {
    if (hasSpecialSeasonEnrolments()) {
        throw new org.fenixedu.academic.domain.exceptions.DomainException("error.student.StudentStatute.has.special.season.enrolment");
    }
}