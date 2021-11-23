public com.uzh.csg.overlaynetworks.service.MessageResult sendMessage(com.uzh.csg.overlaynetworks.service.Message message) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    com.uzh.csg.overlaynetworks.web3j.MessageService messageService = new com.uzh.csg.overlaynetworks.web3j.MessageService();
    client.sendMessage(message.getReceiver().getName(), message.getMessage());
    com.uzh.csg.overlaynetworks.service.MessageResult result = new com.uzh.csg.overlaynetworks.service.MessageResult();
    if (message.getNotary()) {
        messageService.writeToBlockchain(message, result.getMessageId());
    }
    return result;
}