public synchronized org.apache.activemq.artemis.core.client.impl.ClientProducerCredits getCredits(final org.apache.activemq.artemis.api.core.SimpleString address, final boolean anon) {
    setAddress(null, address);
    org.apache.activemq.artemis.core.client.impl.ClientProducerCredits credits = producerCreditManager.getCredits(address, anon, sessionContext);
    return credits;
}