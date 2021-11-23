public void clearResources() {
    this.clearLacpNodes();
    org.opendaylight.lacp.packethandler.TxProcessor.resetLacpLoaded();
    org.opendaylight.lacp.queue.LacpTxQueue lacpTxQueue = org.opendaylight.lacp.queue.LacpTxQueue.getLacpTxQueueInstance();
    lacpTxQueue.deleteLacpQueue(LacpTxQueue.QueueType.LACP_TX_NTT_QUEUE);
    lacpTxQueue.deleteLacpQueue(LacpTxQueue.QueueType.LACP_TX_PERIODIC_QUEUE);
    org.opendaylight.lacp.packethandler.PduDecoderProcessor.setLacploaded(false);
}