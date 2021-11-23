@java.lang.Override
public org.apache.kafka.common.requests.AbstractResponse getErrorResponse(int throttleTimeMs, java.lang.Throwable e) {
    short versionId = version();
    switch (versionId) {
        case 0 :
        case 1 :
            return new org.apache.kafka.common.requests.ControlledShutdownResponse(org.apache.kafka.common.protocol.Errors.forException(e), java.util.Collections.<org.apache.kafka.common.TopicPartition>emptySet());
        default :
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Version %d is not valid. Valid versions for %s are 0 to %d", versionId, this.getClass().getSimpleName(), ApiKeys.CONTROLLED_SHUTDOWN_KEY.latestVersion()));
    }
}