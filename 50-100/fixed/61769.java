public java.lang.String execute(com.happyr.mq2php.message.Message message) {
    com.happyr.mq2php.message.Header headerUrl = message.getHeaderByName("http_url");
    if (headerUrl == null) {
        return "Message has no URL. Can't process this message with HttpExecutor";
    }
    try {
        return sendHttpPost(headerUrl, new java.lang.String(com.happyr.mq2php.util.Marshaller.toBytes(message)));
    } catch (java.io.IOException e) {
        return e.getMessage();
    }
}