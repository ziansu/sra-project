@java.lang.Override
public com.codesense.tester.core.models.entities.Test updateTest(java.lang.Long testID, com.codesense.tester.core.models.entities.Test testData) {
    com.codesense.tester.core.models.entities.Test test = testRepo.getTestByTestID(testData.getTestId());
    if (test == null) {
        return testRepo.updateTest(testData);
    }else {
        throw new com.codesense.tester.core.services.exceptions.TestNotFoundException();
    }
}