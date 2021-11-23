public void sendToAll(java.util.List<io.smacc.esender.domain.Recipient> recipients, io.smacc.esender.domain.Message message) {
    if (recipients.isEmpty()) {
        throw new io.smacc.esender.exception.NoRecipientsException();
    }
    boolean finished = false;
    for (io.smacc.esender.provider.EmailProvider provider : emailProviders) {
        try {
            provider.trySend(recipients, message);
            finished = true;
            break;
        } catch (java.lang.Exception e) {
            io.smacc.esender.repository.SenderRepository.log.error("Sending has failed with provider={}. error message={}", provider.toString(), e.getMessage());
        }
    }
    if (!finished) {
        reportError();
    }
}