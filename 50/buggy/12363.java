public void closeRemoteConnection() {
    cRemoteChangeSubject.update(false);
    cRemoteConnection.disconnect();
}