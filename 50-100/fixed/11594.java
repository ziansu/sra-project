private static java.lang.String _getParentMessageIdFromSubject(javax.mail.Message message) throws java.lang.Exception {
    if ((message.getSubject()) == null) {
        return null;
    }
    java.lang.String parentMessageId = null;
    java.lang.String subject = message.getSubject();
    int pos = subject.lastIndexOf(CharPool.LESS_THAN);
    if (pos != (-1)) {
        parentMessageId = subject.substring(pos);
    }
    return parentMessageId;
}