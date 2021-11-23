@jolie.runtime.embedding.RequestResponse
public jolie.runtime.Value listDB() {
    jolie.runtime.Value v = jolie.runtime.Value.create();
    com.mongodb.client.MongoIterable<java.lang.String> databaseNames = joliex.mongodb.MongoDbConnector.mongoClient.listDatabaseNames();
    com.mongodb.client.MongoCursor<java.lang.String> databaseNamesIterator = databaseNames.iterator();
    int counterDatabase = 0;
    while (databaseNamesIterator.hasNext()) {
        v.getChildren("db").get(counterDatabase).add(jolie.runtime.Value.create(databaseNamesIterator.next()));
    } 
    return v;
}