@java.lang.Override
public double getEctsCredits() {
    org.fenixedu.academic.domain.ExecutionYear conclusion = getConclusionYear();
    return getRegistration().getLastStudentCurricularPlan().getCycle(getRequestedCycle()).getDefaultEcts(conclusion);
}