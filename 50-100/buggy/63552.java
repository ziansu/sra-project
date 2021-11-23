private int sendWithRetry(java.lang.String message) {
    int sendNumber = 0;
    for (int i = 1; (i <= (cn.junety.alarm.sender.client.Client.MAX_RETRY_TIMES)) && (sendNumber > 0); i++) {
        logger.info("send alarm fail, retry times:{}, data:{}", i, message);
        sendNumber = send(message);
    }
    if (sendNumber > 0) {
        return sendNumber;
    }
    logger.info("send alarm always fail, content:{}", message);
    return sendNumber;
}