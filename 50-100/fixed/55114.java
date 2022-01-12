public void initReplyQueue(java.lang.String replyQueueName) {
    this.replyQueueName = replyQueueName;
    try {
        channelOut = connection.createChannel();
        java.util.Map<java.lang.String, java.lang.Object> args = new java.util.HashMap<java.lang.String, java.lang.Object>();
        args.put("x-message-ttl", 5000);
        channelOut.queueDeclare(replyQueueName, false, false, true, args);
    } catch (java.io.IOException e) {
        Main.logger.log(2, "Host unknown. Aborting...");
        java.lang.System.exit(1);
    }
}