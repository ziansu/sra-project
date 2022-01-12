private static void resetMQMessagePosition(com.ibm.mq.MQMessage message) throws java.io.EOFException {
    message.seek(0);
}