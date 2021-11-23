private services.MimeMultipart createInvitation() throws javax.mail.MessagingException {
    services.MimeMultipart body = new services.MimeMultipart("alternative");
    javax.mail.BodyPart textContent = new services.MimeBodyPart();
    javax.mail.BodyPart calendarPart = new services.MimeBodyPart();
    if ((message) != null) {
        textContent.setContent(message, "text/plain; charset=utf-8");
        body.addBodyPart(textContent);
    }
    calendarPart.setContent(createCalendarEvent(), "text/calendar;method=REQUEST");
    calendarPart.addHeader("Content-Class", "urn:content-classes:calendarmessage");
    body.addBodyPart(calendarPart);
    return body;
}