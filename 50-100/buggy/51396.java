@java.lang.Override
public com.claymus.commons.shared.UserSignUpSource getSignUpSource() {
    if ((signUpSource) != null)
        return signUpSource;
    
    switch (status) {
        case PRELAUNCH_REFERRAL :
        case PRELAUNCH_SIGNUP :
            return com.claymus.commons.shared.UserSignUpSource.PRE_LAUNCH_WEBSITE;
        case POSTLAUNCH_REFERRAL :
        case POSTLAUNCH_SIGNUP :
            return com.claymus.commons.shared.UserSignUpSource.WEBSITE;
        case POSTLAUNCH_SIGNUP_SOCIALLOGIN :
            return com.claymus.commons.shared.UserSignUpSource.WEBSITE_FACEBOOK;
        case ANDROID_SIGNUP :
            return com.claymus.commons.shared.UserSignUpSource.ANDROID_APP;
        case ANDROID_SIGNUP_FACEBOOK :
            return com.claymus.commons.shared.UserSignUpSource.ANDROID_APP_FACEBOOK;
        case ANDROID_SIGNUP_GOOGLE :
            return com.claymus.commons.shared.UserSignUpSource.ANDROID_APP_GOOGLE;
    }
    return null;
}