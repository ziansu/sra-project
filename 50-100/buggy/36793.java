private void initFields(android.os.Bundle savedInstanceState) {
    resources = getResources();
    if ((savedInstanceState != null) && (savedInstanceState.containsKey(com.quickblox.q_municate.ui.activities.authorization.BaseAuthActivity.STARTED_LOGIN_TYPE))) {
        loginType = ((com.quickblox.q_municate_core.models.LoginType) (savedInstanceState.getSerializable(com.quickblox.q_municate.ui.activities.authorization.BaseAuthActivity.STARTED_LOGIN_TYPE)));
    }
    facebookHelper = new com.quickblox.q_municate.utils.helpers.FacebookHelper(this);
    twitterDigitsHelper = new com.quickblox.q_municate.utils.helpers.TwitterDigitsHelper(this);
    twitterDigitsAuthCallback = new com.quickblox.q_municate.ui.activities.authorization.BaseAuthActivity.TwitterDigitsAuthCallback();
    loginSuccessAction = new com.quickblox.q_municate.ui.activities.authorization.BaseAuthActivity.LoginSuccessAction();
    socialLoginSuccessAction = new com.quickblox.q_municate.ui.activities.authorization.BaseAuthActivity.SocialLoginSuccessAction();
    failAction = new com.quickblox.q_municate.ui.activities.authorization.BaseAuthActivity.FailAction();
}