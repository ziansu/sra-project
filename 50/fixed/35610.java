public void sendMessage(java.lang.String phone, java.lang.String content) {
    com.twilio.rest.api.v2010.account.Message message = com.twilio.rest.api.v2010.account.Message.creator(new com.twilio.type.PhoneNumber(phone), new com.twilio.type.PhoneNumber(phone), content).create();
}