@java.lang.Override
public void prepareUpdates() {
    updateTestCaseMessageMap.clear();
    allTestCaseMessageMap.clear();
    addTestCasesFromSavedSetAssessment(org.immregistries.smm.tester.certify.CAAssessmentForQuery.TEST_CASE_SET_FOR_ASSESSMENT_FOR_QUERY, TestCaseMode.DEFAULT, "VXU");
    for (org.immregistries.smm.transform.TestCaseMessage tcm : updateList) {
        updateTestCaseMessageMap.put(tcm.getTestCaseNumberOriginal(), tcm);
    }
}