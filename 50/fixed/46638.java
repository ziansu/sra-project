@java.lang.Override
protected void sendCancel() {
    transport.finishStream(id(), Status.CANCELLED, ErrorCode.CANCEL);
}