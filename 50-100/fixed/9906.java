@org.junit.Test
public void testAbsentEntityCreationSucceeds() throws java.lang.Throwable {
    org.terracotta.connection.Connection client = org.ehcache.clustered.BasicEntityInteractionTest.CLUSTER.newConnection();
    try {
        org.terracotta.connection.entity.EntityRef<org.ehcache.clustered.client.internal.EhcacheClientEntity, org.ehcache.clustered.common.internal.ClusteredTierManagerConfiguration> ref = getEntityRef(client);
        ref.create(blankConfiguration);
        org.junit.Assert.assertThat(ref.fetchEntity(), org.hamcrest.Matchers.not(org.hamcrest.Matchers.nullValue()));
    } finally {
        client.close();
    }
}