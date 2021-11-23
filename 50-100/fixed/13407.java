public static void SMSService(android.content.Context context) {
    kobeissidev.autobirthday.SMS.dbHandler = new kobeissidev.autobirthday.DBHandler(context);
    kobeissidev.autobirthday.SMS.setBirthdayPreferences(context.getApplicationContext());
    kobeissidev.autobirthday.SMS.setTimePreferences(context.getApplicationContext());
    kobeissidev.autobirthday.SMS.setEmptyTime(context);
    kobeissidev.autobirthday.SMS.setEmptyMessage();
    if ((kobeissidev.autobirthday.SMS.isDayToSendMessage(context)) && (kobeissidev.autobirthday.SMS.isTimeToSendMessage(context))) {
        kobeissidev.autobirthday.SMS.sendSMS();
    }
}