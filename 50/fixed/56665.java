public void cancelCurrentSession() {
    if ((currentSession) != null) {
        api.logout(currentSession);
        currentSession = null;
        notifyDataChanged();
    }
}