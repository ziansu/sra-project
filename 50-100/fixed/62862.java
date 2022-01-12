@mockit.Test
public void dynamicMockFullyVerified_verifyAllRecordedExpectationsButNotAllOfTheReplayedOnes() {
    final mockit.DynamicPartialMockingTest.Collaborator collaborator = new mockit.DynamicPartialMockingTest.Collaborator(0);
    new mockit.Expectations(collaborator) {
        {
            collaborator.setValue(1);
        }
    };
    collaborator.setValue(1);
    collaborator.setValue(2);
    new mockit.FullVerifications() {    };
}