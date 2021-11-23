@org.junit.Test
public void testDestroyedEntityAllowsRecreation() throws java.lang.Throwable {
    org.terracotta.connection.Connection client = org.ehcache.clustered.BasicEntityInteractionTest.CLUSTER.newConnection();
    try {
        org.terracotta.connection.entity.EntityRef<org.ehcache.clustered.client.internal.EhcacheClientEntity, org.ehcache.clustered.common.internal.ClusteredTierManagerConfiguration> ref = client.getEntityRef(org.ehcache.clustered.client.internal.EhcacheClientEntity.class, 1, "testDestroyedEntityAllowsRecreation");
        ref.create(blankConfiguration);
        ref.destroy();
        ref.create(blankConfiguration);
        org.junit.Assert.assertThat(ref.fetchEntity(), org.hamcrest.Matchers.not(org.hamcrest.Matchers.nullValue()));
    } finally {
        client.close();
    }
}