private void invalidate(final com.hazelcast.spi.impl.WaitNotifyServiceImpl.WaitingOp waitingOp) throws java.lang.Exception {
    nodeEngine.getOperationService().executeOperation(waitingOp);
}