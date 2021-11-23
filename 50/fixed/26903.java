@org.junit.Test(expected = database.DatabaseAccessException.class)
public void testGetExperimentThatDoesNotExist() throws java.lang.Exception {
    databaseClient.getExperiment(org.bson.types.ObjectId.createFromLegacyFormat(0, 0, 0).toString(), database.SubmissionDatabaseClientTest.PROBLEM_ID, null);
}