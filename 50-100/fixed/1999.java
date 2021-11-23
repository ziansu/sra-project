private static java.util.Date findDate(final java.lang.Thread thread) {
    try {
        final java.lang.String s = net.anfoya.mail.gmail.model.GmailThread.findHeader(thread, "Date");
        return new javax.mail.internet.MailDateFormat().parse(s);
    } catch (final java.lang.Exception e) {
        e.printStackTrace();
        return new java.util.Date();
    }
}