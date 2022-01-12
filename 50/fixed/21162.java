private void waitInitialMemberListFetched() throws java.lang.InterruptedException {
    boolean success = initialListFetchedLatch.await(com.hazelcast.client.spi.impl.ClientMembershipListener.INITIAL_MEMBERS_TIMEOUT_SECONDS, java.util.concurrent.TimeUnit.SECONDS);
    if (!success) {
        com.hazelcast.client.spi.impl.ClientMembershipListener.LOGGER.warning("Error while getting initial member list from cluster!");
    }
}