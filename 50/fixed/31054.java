@java.lang.Override
protected void setProcess() {
    org.tanaguru.entity.audit.ProcessResult processResult = processPageTest("Rgaa32016.Test.4.1.1-3NMI-01");
    checkResultIsPreQualified(processResult, 1, 1);
    checkResultIsNotApplicable(processPageTest("Rgaa32016.Test.4.1.1-4NA-01"));
}