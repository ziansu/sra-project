@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mApplication.getConfigurationManager().setEndUserAcceptedVideoLicense();
    setLicenseAcceptance(true);
    joinTheCall(onlineMeetingFlag, meetingUrl, discoveryUrl, authToken);
}