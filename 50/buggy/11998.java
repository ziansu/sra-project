@java.lang.Override
public void onPayload(final io.grpc.testing.integration.Messages.StreamingOutputCallResponse payload) {
    java.lang.Thread.dumpStack();
    queue.add(payload);
}