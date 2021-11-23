@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    com.facebook.Session session = com.facebook.Session.getActiveSession();
    com.facebook.Session.saveSession(session, outState);
    com.kii.cloud.storage.Kii.onSaveInstanceState(outState);
}