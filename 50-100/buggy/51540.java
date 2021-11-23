private void changePasswordResultFailure(cz.csas.cscore.client.rest.CsRestError error, cz.csas.cscore.client.rest.CsCallback<cz.csas.cscore.locker.PasswordResponse> callback) {
    if (shouldUnregister(error)) {
        unregisterUserInternally();
        mLogManager.log(cz.csas.cscore.utils.StringUtils.logLine(cz.csas.cscore.locker.LOCKER_MODULE, "UNREGISTERED", "Password change failed. No more attempts. User unregistered."), LogLevel.INFO);
    }else
        mLogManager.log(cz.csas.cscore.utils.StringUtils.logLine(cz.csas.cscore.locker.LOCKER_MODULE, "UNLOCKED", ("Password change failed with error: " + (error.getLocalizedMessage()))), LogLevel.INFO);
    
    callback.failure(error);
}