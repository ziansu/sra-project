@android.support.annotation.NonNull
private com.marcosdiez.extratocartao.sms.SMSData createSms(java.lang.String phoneNumber, java.lang.String message) {
    com.marcosdiez.extratocartao.sms.SMSData newSms = new com.marcosdiez.extratocartao.sms.SMSData();
    newSms.setDate(new java.util.Date());
    newSms.setBody(message);
    newSms.setNumber(phoneNumber);
    newSms.setId(0);
    return newSms;
}