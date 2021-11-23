private void respondWithSMS() {
    java.lang.String message = this.responsePreparator.prepareResponse(this.respondingSubject);
    try {
        int attemptsLeft = 3;
        this.sendSMSAndRetryOnFail(this.respondingSubject.getPhoneNumber(), message, attemptsLeft);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}