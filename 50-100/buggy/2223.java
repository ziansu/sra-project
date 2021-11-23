private long daysSinceLastMsg(nyc.c4q.jonathancolon.inContaq.model.Contact contact) {
    long currentTime = java.lang.System.currentTimeMillis();
    long lastMsg = nyc.c4q.jonathancolon.inContaq.utlities.SmsHelper.getLastContactedDate(contentResolver, contact);
    if (lastMsg > 0) {
        long timeElapsed = currentTime - lastMsg;
        long daysSince = timeElapsed / (nyc.c4q.jonathancolon.inContaq.smsreminder.ContactNotificationService.ONE_DAY);
        return daysSince;
    }
    return 0;
}