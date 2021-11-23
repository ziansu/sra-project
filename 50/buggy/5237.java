public void createTestEnvironment() {
    nl.tue.the30daychallenge.data.LocalConnector.dropDatabase();
    createCompletedChallenge();
}