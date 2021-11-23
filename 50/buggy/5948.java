public void unregisterNSDService() {
    mNsdManager.unregisterService(networkRegistrationListener);
    networkRegistrationListener = null;
}