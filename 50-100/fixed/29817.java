@java.lang.Override
public void setUpIndexes() {
    database.SubmissionDatabaseClient.LOG.info("Setting up an index");
    database.SubmissionDatabaseClient.LOG.info("Experiment Index command: {}", new com.mongodb.BasicDBObject(database.DatabaseStringConstants.COURSE_PROBLEM_ID, 1).append(database.DatabaseStringConstants.USER_ID, 1));
    database.getCollection(database.DatabaseStringConstants.EXPERIMENT_COLLECTION).createIndex(new com.mongodb.BasicDBObject(database.DatabaseStringConstants.COURSE_PROBLEM_ID, 1).append(database.DatabaseStringConstants.PROBLEM_BANK_ID, 1).append(database.DatabaseStringConstants.USER_ID, 1).append("unique", true));
    database.getCollection(database.DatabaseStringConstants.SOLUTION_COLLECTION).createIndex(new com.mongodb.BasicDBObject(database.DatabaseStringConstants.PROBLEM_BANK_ID, 1).append("unique", true));
}