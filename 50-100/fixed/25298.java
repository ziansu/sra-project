public com.uzh.csg.overlaynetworks.service.MessageResult sendMessage(com.uzh.csg.overlaynetworks.service.Message message) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    com.uzh.csg.overlaynetworks.web3j.MessageService messageService = new com.uzh.csg.overlaynetworks.web3j.MessageService();
    com.uzh.csg.overlaynetworks.service.MessageResult result = new com.uzh.csg.overlaynetworks.service.MessageResult();
    client.sendMessage(message.getReceiver().getName(), message.getMessage(), result.getMessageId());
    if (message.getNotary()) {
        messageService.writeToBlockchain(message, result.getMessageId());
    }
    return result;
}