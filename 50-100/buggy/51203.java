@org.springframework.transaction.annotation.Transactional
public void saveDataWithException(long globalId, long shardingId) {
    org.pinus4j.entity.TestGlobalEntity testGlobalEntity = new org.pinus4j.entity.TestGlobalEntity();
    testGlobalEntity.setId(((int) (globalId)));
    org.pinus4j.entity.TestEntity testEntity = new org.pinus4j.entity.TestEntity();
    testEntity.setId(shardingId);
    testEntity.setTestInt(10);
    storageClient.globalSave(testGlobalEntity);
    storageClient.save(testEntity);
    throw new java.lang.RuntimeException();
}