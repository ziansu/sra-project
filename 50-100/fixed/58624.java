public void addBccAddresses(com.fsck.k9.mail.Address... bccRecipients) {
    if ((bccRecipients.length) > 0) {
        addRecipientsFromAddresses(RecipientType.BCC, bccRecipients);
        java.lang.String bccAddress = account.getAlwaysBcc();
        boolean alreadyVisible = recipientMvpView.isBccVisible();
        boolean singleBccRecipientFromAccount = ((bccRecipients.length) == 1) && (bccRecipients[0].toString().equals(bccAddress));
        recipientMvpView.setBccVisibility((alreadyVisible || (!singleBccRecipientFromAccount)));
        updateRecipientExpanderVisibility();
    }
}