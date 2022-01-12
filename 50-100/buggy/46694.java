public java.util.List<omelet.mail.Message> filterEmailsBy(omelet.mail.FilterEmails searchCat, java.util.List<omelet.mail.Message> messages, java.lang.String filterText) {
    try {
        return filterFromToSubject(searchCat, filterText, ((omelet.mail.Message[]) (messages.toArray())));
    } catch (omelet.mail.MessagingException e) {
        omelet.mail.Email.LOGGER.error(e);
    }
    return null;
}