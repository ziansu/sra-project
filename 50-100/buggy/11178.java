@org.junit.Test
public void testPresentEntityDestroyNotBlockedByReleasedReferenceSucceeds() throws java.lang.Throwable {
    org.terracotta.connection.Connection client = org.ehcache.clustered.BasicEntityInteractionTest.CLUSTER.newConnection();
    try {
        org.terracotta.connection.entity.EntityRef<org.ehcache.clustered.client.internal.EhcacheClientEntity, org.ehcache.clustered.common.internal.ClusteredTierManagerConfiguration> ref = client.getEntityRef(org.ehcache.clustered.client.internal.EhcacheClientEntity.class, 1, "testPresentEntityDestroyNotBlockedByReleasedReferenceSucceeds");
        ref.create(blankConfiguration);
        ref.fetchEntity().close();
        ref.destroy();
    } finally {
        client.close();
    }
}