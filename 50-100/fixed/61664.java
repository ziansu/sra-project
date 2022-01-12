public void logOUT() {
    com.facebook.Session session = com.facebook.Session.getActiveSession();
    if (session != null) {
        session.close();
        session.closeAndClearTokenInformation();
    }else {
        com.facebook.Session session2 = com.facebook.Session.openActiveSession(this, false, null);
        if (session2 != null)
            session2.close();
        
        session2.closeAndClearTokenInformation();
    }
    com.facebook.Session.setActiveSession(null);
}