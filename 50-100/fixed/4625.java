@java.lang.Override
public org.fenixedu.academic.domain.curricularRules.executors.RuleResult execute(final org.fenixedu.academic.domain.enrolment.EnrolmentContext enrolmentContext) {
    final java.util.Set<org.fenixedu.academic.domain.curricularPeriod.CurricularPeriod> configured = getCurricularPeriodsConfigured(getYearMin(), getYearMax(), true);
    if (configured == null) {
        return createFalseConfiguration();
    }
    final java.math.BigDecimal total = getCreditsEnroledAndEnroling(enrolmentContext, configured);
    return (total.compareTo(getCredits())) <= 0 ? createTrue() : createFalseLabelled(total);
}