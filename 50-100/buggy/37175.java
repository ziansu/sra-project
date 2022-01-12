public void onResume() {
    if ((uiHelper) != null) {
        com.facebook.Session session = com.facebook.Session.getActiveSession();
        if ((session != null) && ((session.isOpened()) || (session.isClosed()))) {
            onSessionStateChange(session, session.getState(), null);
        }
        uiHelper.onResume();
    }
}