private void internalRelease(com.tc.object.EntityDescriptor entityDescriptor) throws org.terracotta.exception.EntityException {
    stateManager.waitUntilRunning();
    this.objectStoreMap.remove(entityDescriptor);
    java.util.Set<com.tc.entity.VoltronEntityMessage.Acks> requestedAcks = java.util.EnumSet.of(VoltronEntityMessage.Acks.APPLIED);
    boolean requiresReplication = false;
    byte[] payload = new byte[0];
    com.tc.entity.NetworkVoltronEntityMessage message = createMessageWithDescriptor(entityDescriptor, requiresReplication, payload, VoltronEntityMessage.Type.RELEASE_ENTITY);
    synchronousWaitForResponse(message, requestedAcks);
}