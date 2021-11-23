@org.junit.Test(expected = database.DatabaseAccessException.class)
public void testThrowsExceptionIfNoDataIsSet() throws java.lang.Exception {
    com.mongodb.client.MongoDatabase db = fongoRule.getDatabase();
    protobuf.srl.submission.Submission.SrlSubmission.Builder build = Submission.SrlSubmission.newBuilder();
    protobuf.srl.submission.Submission.SrlExperiment expected = getFakeExperiment("User1", build.build());
    databaseClient.saveExperiment(expected, 200);
}