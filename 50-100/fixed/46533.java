private java.util.ArrayList<info.wso2.scim2.compliance.entities.TestResult> GetSortTest() throws info.wso2.scim2.compliance.exception.ComplianceException {
    java.util.ArrayList<info.wso2.scim2.compliance.entities.TestResult> testResults = new java.util.ArrayList<>();
    try {
        CreateTestsUsers();
        testResults.add(SortUsers());
    } catch (info.wso2.scim2.compliance.exception.GeneralComplianceException e) {
        testResults.add(e.getResult());
    }
    try {
        CreateTestsGroups();
        testResults.add(SortGroups());
    } catch (info.wso2.scim2.compliance.exception.GeneralComplianceException e) {
        testResults.add(e.getResult());
    }
    return testResults;
}