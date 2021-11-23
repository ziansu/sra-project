private java.lang.String processMessageId(java.lang.String messageId) {
    if (messageId == null) {
        com.pkrete.restgateway.ConsumerGateway.logger.debug("\"{}\" header is null. Use auto-generated id \"{}\" instead.", Constants.XRD_HEADER_MESSAGE_ID, messageId);
        return com.pkrete.xrd4j.common.util.MessageHelper.generateId();
    }
    return messageId;
}