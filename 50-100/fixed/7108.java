private void setupSandbox() {
    org.commcare.util.mocks.MockUserDataSandbox sandbox = new org.commcare.util.mocks.MockUserDataSandbox(mPrototypeFactory);
    sandbox.setAppFixtureStorageLocation(((org.javarosa.core.services.storage.IStorageUtilityIndexed<org.javarosa.core.model.instance.FormInstance>) (org.javarosa.core.services.storage.StorageManager.getStorage(FormInstance.STORAGE_KEY))));
    mSandbox = sandbox;
    if ((mLocalUserCredentials) != null) {
        restoreUserToSandbox(mSandbox, mLocalUserCredentials[0], mLocalUserCredentials[1]);
    }else
        if ((mRestoreFile) != null) {
            restoreFileToSandbox(mSandbox, mRestoreFile);
        }else {
            restoreDemoUserToSandbox(mSandbox);
        }
    
}