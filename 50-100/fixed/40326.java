@java.lang.Override
public java.util.Set<com.googlecode.cqengine.testutil.Car> call() throws java.lang.Exception {
    com.googlecode.cqengine.resultset.ResultSet<com.googlecode.cqengine.testutil.Car> resultSet = collection.retrieve(all(com.googlecode.cqengine.testutil.Car.class));
    readStartedSignal.release();
    readBlock.acquire();
    java.util.Set<com.googlecode.cqengine.testutil.Car> materializedObjects = com.googlecode.cqengine.TransactionalIndexedCollectionTest.asSet(resultSet);
    resultSet.close();
    return materializedObjects;
}