public static void handlerMsg(java.lang.String routingKey, byte[] body) throws java.io.IOException {
    com.ojdbc.rmqhelper.rmq.DefaultConsumer.msgQueue.add(new com.ojdbc.rmqhelper.rmq.MsgBean(routingKey, body));
}