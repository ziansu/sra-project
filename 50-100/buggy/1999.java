private static java.util.Date findDate(final java.lang.Thread thread) {
    final java.lang.String s = net.anfoya.mail.gmail.model.GmailThread.findHeader(thread, "Date");
    try {
        return new javax.mail.internet.MailDateFormat().parse(s);
    } catch (final java.text.ParseException e) {
        e.printStackTrace();
        return new java.util.Date();
    }
}