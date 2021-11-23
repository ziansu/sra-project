public void initReplyQueue(java.lang.String replyQueueName) {
    this.replyQueueName = replyQueueName;
    try {
        channelOut = connection.createChannel();
        channelOut.queueDeclare(replyQueueName, false, false, true, null);
    } catch (java.io.IOException e) {
        Main.logger.log(2, "Host unknown. Aborting...");
        java.lang.System.exit(1);
    }
}