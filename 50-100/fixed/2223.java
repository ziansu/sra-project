private long daysSinceLastMsg(nyc.c4q.jonathancolon.inContaq.model.Contact contact) {
    long currentTime = java.lang.System.currentTimeMillis();
    long lastMsg = nyc.c4q.jonathancolon.inContaq.utlities.SmsHelper.getLastContactedDate(contentResolver, contact);
    if (lastMsg > 0) {
        long timeElapsed = currentTime - lastMsg;
        return timeElapsed / (nyc.c4q.jonathancolon.inContaq.smsreminder.ContactNotificationService.ONE_DAY);
    }
    return 0;
}