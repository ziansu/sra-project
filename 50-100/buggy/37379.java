@java.lang.Override
public org.wso2.andes.kernel.AndesMessagePart getContent(long messageId, int offsetValue) throws org.wso2.andes.kernel.AndesException {
    org.wso2.andes.kernel.AndesMessagePart messagePart = null;
    org.wso2.carbon.metrics.manager.Timer.Context messageContentRetrievalContext = org.wso2.carbon.metrics.manager.MetricManager.timer(Level.INFO, MetricsConstants.GET_CONTENT).start();
    try {
        messagePart = getContentFromCache(messageId, offsetValue);
        if (null == messagePart) {
            messagePart = getContentFromStorage(messageId, offsetValue);
        }
    } finally {
        messageContentRetrievalContext.stop();
    }
    return messagePart;
}