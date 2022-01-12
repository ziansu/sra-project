@java.lang.Override
public void onInitialized(com.waz.api.Self self) {
    if (com.waz.zclient.utils.IntentUtils.isEmailVerificationIntent(getIntent())) {
    }
    if (self.isLoggedIn()) {
        switch (self.getClientRegistrationState()) {
            case PASSWORD_MISSING :
                startSignUp();
                return ;
        }
        startMain();
    }else {
        startSignUp();
    }
    getControllerFactory().getLoadTimeLoggerController().hideLaunchScreen();
}