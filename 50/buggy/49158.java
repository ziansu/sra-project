public javax.ws.rs.core.Response performTransfer(java.lang.String receiverAccountNumber, java.lang.String senderAccountNumber, java.math.BigDecimal transferValue) {
    mtrojanowski.revolut.consumes.PerformTransferDTO performTransferDTO = mapToPerformTransferDTO(receiverAccountNumber, senderAccountNumber, transferValue);
    return transferResource.performTransfer(performTransferDTO);
}