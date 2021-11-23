private void fireWKPFGetWuObjectList(edu.uci.eecs.wukong.framework.model.WKPFPackage message) {
    edu.uci.eecs.wukong.framework.mptn.MPTN.LOGGER.info("Received get WuObject List message");
    for (edu.uci.eecs.wukong.framework.wkpf.WKPFMessageListener listener : listeners) {
        listener.onWKPFGetWuObjectList(message.getSourceAddress(), message.getPayload());
    }
}