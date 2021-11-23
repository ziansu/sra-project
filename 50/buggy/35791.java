@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    this.fetchEmergencyDetails();
    this.sendSMSToNumber();
}