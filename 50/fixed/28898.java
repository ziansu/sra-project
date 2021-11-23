public void run() {
    if (run) {
        if (sendSMSMessage(getResources().getString(EnumSms.WHERE.getSms()))) {
            launchSearch();
        }
    }
}