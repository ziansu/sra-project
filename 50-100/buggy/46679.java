@org.junit.Test
public void testAbsentEntityDestroyFails() throws java.lang.Throwable {
    org.terracotta.connection.Connection client = org.ehcache.clustered.BasicEntityInteractionTest.CLUSTER.newConnection();
    try {
        org.terracotta.connection.entity.EntityRef<org.ehcache.clustered.client.internal.EhcacheClientEntity, org.ehcache.clustered.common.internal.ClusteredTierManagerConfiguration> ref = client.getEntityRef(org.ehcache.clustered.client.internal.EhcacheClientEntity.class, 1, "testAbsentEntityDestroyFails");
        try {
            ref.destroy();
            org.junit.Assert.fail("Expected EntityNotFoundException");
        } catch (org.terracotta.exception.EntityNotFoundException e) {
        }
    } finally {
        client.close();
    }
}