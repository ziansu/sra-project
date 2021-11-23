public javax.ws.rs.core.Response performTransfer(java.lang.String senderAccountNumber, java.lang.String receiverAccountNumber, java.math.BigDecimal transferValue) {
    mtrojanowski.revolut.consumes.PerformTransferDTO performTransferDTO = mapToPerformTransferDTO(receiverAccountNumber, senderAccountNumber, transferValue);
    return transferResource.performTransfer(performTransferDTO);
}