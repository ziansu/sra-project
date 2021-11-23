public void sendPaymentRequest(final java.lang.String mdid, info.blockchain.wallet.contacts.data.PaymentRequest request, java.lang.String fTxId) throws info.blockchain.wallet.exceptions.MetadataException, info.blockchain.wallet.exceptions.SharedMetadataException, java.io.IOException, org.spongycastle.crypto.InvalidCipherTextException {
    info.blockchain.wallet.contacts.Contacts.log.info("Sending inter-wallet-comms payment request response");
    sendMessage(mdid, request.toJson(), info.blockchain.wallet.contacts.Contacts.TYPE_PAYMENT_REQUEST_RESPONSE, true);
    info.blockchain.wallet.contacts.data.Contact contact = getContactFromMdid(mdid);
    info.blockchain.wallet.contacts.data.FacilitatedTransaction ftx = contact.getFacilitatedTransactions().get(fTxId);
    ftx.setState(FacilitatedTransaction.STATE_WAITING_FOR_PAYMENT);
    ftx.setRole(FacilitatedTransaction.ROLE_PR_INITIATOR);
    ftx.updateCompleted();
    save();
}