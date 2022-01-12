@org.junit.Test
public void testSave() throws java.lang.Exception {
    org.pinus4j.entity.TestGlobalEntity globalEntity = createGlobalEntity();
    globalEntity.setId(org.pinus4j.api.DefaultPinusClientTest.pinusClient.genClusterUniqueLongId("test"));
    org.pinus4j.entity.TestGlobalUnionKeyEntity globalUKEntity = createGlobalUnionKeyEntity();
    org.pinus4j.entity.TestEntity shardingEntity = createEntity();
    shardingEntity.setId(org.pinus4j.api.DefaultPinusClientTest.pinusClient.genClusterUniqueLongId("test"));
    org.pinus4j.api.DefaultPinusClientTest.pinusClient.save(globalEntity);
    java.lang.System.out.println(globalEntity.getId());
    org.pinus4j.api.DefaultPinusClientTest.pinusClient.save(globalUKEntity);
    java.lang.System.out.println(globalUKEntity);
    org.pinus4j.api.DefaultPinusClientTest.pinusClient.save(shardingEntity);
    java.lang.System.out.println(shardingEntity.getId());
}