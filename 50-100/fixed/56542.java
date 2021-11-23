@java.lang.Override
public void sendInvalidationEvent(java.lang.String name, com.hazelcast.nio.serialization.Data key, java.lang.String sourceUuid) {
    if (key == null) {
        sendSingleInvalidationEvent(name, null, sourceUuid);
    }else {
        if (invalidationMessageBatchEnabled) {
            sendBatchInvalidationEvent(name, key, sourceUuid);
        }else {
            sendSingleInvalidationEvent(name, key, sourceUuid);
        }
    }
}