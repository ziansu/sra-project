@org.junit.Test
@org.junit.Ignore
public void testPresentEntityDestroyBlockedByHeldReferenceSucceeds() throws java.lang.Throwable {
    org.terracotta.connection.Connection client = org.ehcache.clustered.BasicEntityInteractionTest.CLUSTER.newConnection();
    try {
        org.terracotta.connection.entity.EntityRef<org.ehcache.clustered.client.internal.EhcacheClientEntity, org.ehcache.clustered.common.internal.ClusteredTierManagerConfiguration> ref = getEntityRef(client);
        ref.create(blankConfiguration);
        org.ehcache.clustered.client.internal.EhcacheClientEntity entity = ref.fetchEntity();
        try {
            ref.destroy();
        } finally {
            entity.close();
        }
    } finally {
        client.close();
    }
}