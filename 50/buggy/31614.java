private java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> getMessageBody(org.wso2.carbon.messaging.CarbonMessage msg) {
    java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> msgBody = new java.util.concurrent.LinkedBlockingQueue(msg.getFullMessageBody());
    return msgBody;
}