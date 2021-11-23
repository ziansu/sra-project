@java.lang.Override
public void onClick(android.view.View v) {
    com.facebook.Session s = com.facebook.Session.getActiveSession();
    if (!(session.isClosed())) {
        session.closeAndClearTokenInformation();
    }
    com.kii.cloud.storage.KiiUser.logOut();
}