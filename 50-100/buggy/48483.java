private void sendNotification(java.lang.String text, java.util.List<java.lang.String> klassen) {
    java.lang.String payload = com.notnoop.apns.APNS.newPayload().alertBody(text).badge(1).sound("default").build();
    java.util.List<java.lang.String> pushTokens = this.registrationRep.findPushTokensByKlassen(klassen, OS.iOS);
    this.apnsService.push(pushTokens, payload);
}