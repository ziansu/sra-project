@org.junit.Test
public void testApiWithMongoConfiguration() {
    com.effektif.workflow.api.Configuration configuration = com.effektif.mongo.test.MongoApiTest.createMongoTestConfiguration();
    com.mongodb.DB db = configuration.get(com.mongodb.DB.class);
    db.dropDatabase();
    com.effektif.workflow.test.TestSuiteHelper.run(configuration, com.effektif.workflow.test.api.UserTaskTest.class, "testTaskRole");
}