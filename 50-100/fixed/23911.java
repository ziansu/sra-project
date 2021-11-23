@java.lang.Override
public void recipient(java.lang.String pRecipient) throws org.subethamail.smtp.RejectException {
    try {
        mEmailMessage.addRecipient(pRecipient.toLowerCase());
    } catch (uk.co.fivium.dmda.EmailMessages.InvalidRecipientException e) {
        mLogger.error(((("Email recipient has no configured database: " + pRecipient) + ". ") + (mEmailMessage.toString())));
        rejectEmail((("The recipient " + pRecipient) + " cannot be found at this domain."));
    }
}