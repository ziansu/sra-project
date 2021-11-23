@java.lang.Override
protected void sendCancel() {
    if (transport.finishStream(id(), Status.CANCELLED)) {
        frameWriter.rstStream(id(), ErrorCode.CANCEL);
        transport.stopIfNecessary();
    }
}