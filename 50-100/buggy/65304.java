private void finalizeNotCompletedOperations(byte seq, com.clouway.pos.print.core.WarningChannel channel) throws java.io.IOException {
    java.util.Set<com.clouway.pos.print.printer.Status> initStatus = getStatus();
    if (initStatus.contains(com.clouway.pos.print.printer.Status.FISCAL_RECEIPT_IS_OPEN)) {
        closeFiscalReceipt(seq, 0.0F, channel);
    }
    if (initStatus.contains(com.clouway.pos.print.printer.Status.NON_FISCAL_RECEIPT_IS_OPEN)) {
        closeNonFiscalReceipt(seq, channel);
    }
}