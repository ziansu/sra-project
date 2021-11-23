final java.util.Date parse() {
    int startPosition = pos.getIndex();
    try {
        return tryParse();
    } catch (java.lang.Exception e) {
        if (javax.mail.internet.MailDateFormat.LOGGER.isLoggable(java.util.logging.Level.FINE)) {
            javax.mail.internet.MailDateFormat.LOGGER.log(java.util.logging.Level.FINE, (("Bad date: '" + (text)) + "'"), e);
        }
        pos.setErrorIndex(pos.getIndex());
        pos.setIndex(startPosition);
        return null;
    }
}