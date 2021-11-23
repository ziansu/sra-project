@java.lang.Override
public long getEctsCredits() {
    org.fenixedu.academic.domain.ExecutionYear conclusion = getConclusionYear();
    return java.lang.Math.round(getRegistration().getLastStudentCurricularPlan().getCycle(getRequestedCycle()).getDefaultEcts(conclusion));
}