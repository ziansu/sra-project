public void initReplyQueue(java.lang.String replyQueueName) {
    this.replyQueueName = replyQueueName;
    try {
        channelOut = connection.createChannel();
        server.Map<java.lang.String, java.lang.Object> args = new server.HashMap<java.lang.String, java.lang.Object>();
        args.put("x-message-ttl", 5000);
        channelOut.queueDeclare(replyQueueName, false, false, true, args);
    } catch (java.io.IOException e) {
        Main.logger.log(2, "Host unknown. Aborting...");
        java.lang.System.exit(1);
    }
}