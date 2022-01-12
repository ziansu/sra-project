@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    com.cs3235.door.doorlockandroid.login.IvleLoginManager ivleLoginManager = new com.cs3235.door.doorlockandroid.login.IvleLoginManager(httpManager);
    com.cs3235.door.doorlockandroid.login.IvleLoginManager.IvleLoginResult ivleResult = ivleLoginManager.loginToIvle(mEmail, mPassword);
    if (!(ivleResult.successful)) {
        errorMessage = ivleResult.failureMessage;
        return false;
    }
    com.cs3235.door.doorlockandroid.login.SmartphoneCardLoginManager smartphoneCardManager = new com.cs3235.door.doorlockandroid.login.SmartphoneCardLoginManager(httpManager, getPhoneUuid());
    com.cs3235.door.doorlockandroid.login.SmartphoneCardLoginManager.SmartphoneCardLoginResult smartphoneDoorResult = smartphoneCardManager.loginToSmartphoneCardSystem(ivleResult.user);
    if (!(smartphoneDoorResult.successful)) {
        errorMessage = smartphoneDoorResult.failureMessage;
        return false;
    }
    loggedInUser = smartphoneDoorResult.user;
    return true;
}