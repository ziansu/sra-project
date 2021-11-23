protected void postStopConsumedMsg(java.lang.String reason) {
    do {
        com.linkedin.pinot.common.protocols.SegmentCompletionProtocol.Response response = _protocolHandler.segmentStoppedConsuming(_segmentNameStr, _currentOffset, reason);
        if ((response.getStatus()) == (SegmentCompletionProtocol.ControllerResponseStatus.PROCESSED)) {
            com.linkedin.pinot.core.data.manager.realtime.LLRealtimeSegmentDataManager.LOGGER.info("Got response {}", response.toJsonString());
            break;
        }
        com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly(10, java.util.concurrent.TimeUnit.SECONDS);
        com.linkedin.pinot.core.data.manager.realtime.LLRealtimeSegmentDataManager.LOGGER.info("Retrying after response {}", response.toJsonString());
    } while (!(_shouldStop) );
}