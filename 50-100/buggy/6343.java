private static org.bson.Document getTaskFromMongoDB(int pybossa_task_id) {
    try {
        com.mongodb.client.MongoCollection<org.bson.Document> collection = sociam.pybossa.TaskCollector.database.getCollection(Config.taskCollection);
        org.bson.Document myDoc = collection.find(eq("pybossa_task_id", pybossa_task_id)).first();
        return myDoc;
    } catch (java.lang.Exception e) {
        sociam.pybossa.TaskCollector.logger.error(("Error " + e));
        return null;
    }
}