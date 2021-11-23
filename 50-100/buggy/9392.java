public static org.terracotta.passthrough.PassthroughMessage createUnexpectedReleaseMessage(final java.lang.String entityClassName, final java.lang.String entityName, final long clientInstanceID) {
    boolean shouldReplicateToPassives = false;
    return new org.terracotta.passthrough.PassthroughMessage(org.terracotta.passthrough.PassthroughMessage.Type.UNEXPECTED_RELEASE, shouldReplicateToPassives) {
        @java.lang.Override
        protected void populateStream(java.io.DataOutputStream output) throws java.io.IOException {
            output.writeUTF(entityClassName);
            output.writeUTF(entityName);
            output.writeLong(clientInstanceID);
        }
    };
}