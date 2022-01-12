private java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> getMessageBody(org.wso2.carbon.messaging.CarbonMessage msg) {
    return new java.util.concurrent.LinkedBlockingQueue(msg.getFullMessageBody());
}